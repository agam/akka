/**
 * Copyright (C) 2009-2017 Lightbend Inc. <http://www.lightbend.com>
 */
package akka.typed.cluster.internal

import akka.serialization.{ SerializationExtension, SerializerWithStringManifest }
import akka.typed.{ ActorRef, TypedSpec }
import akka.typed.TypedSpec.Create
import akka.typed.internal.adapter.ActorSystemAdapter
import akka.typed.scaladsl.Actor
import akka.typed.scaladsl.AskPattern._

class MiscMessageSerializerSpec extends TypedSpec {

  object `The typed MiscMessageSerializer` {

    def `must serialize and deserialize typed actor refs `(): Unit = {

      val ref = (adaptedSystem ? Create(Actor.empty[Unit], "some-actor")).futureValue

      val serialization = SerializationExtension(ActorSystemAdapter.toUntyped(adaptedSystem))

      val serializer = serialization.findSerializerFor(ref) match {
        case s: SerializerWithStringManifest ⇒ s
      }

      val manifest = serializer.manifest(ref)
      val serialized = serializer.toBinary(ref)

      val result = serializer.fromBinary(serialized, manifest)

      result should ===(ref)

    }
  }

}
