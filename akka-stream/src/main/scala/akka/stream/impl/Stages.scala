/**
 * Copyright (C) 2015-2017 Lightbend Inc. <http://www.lightbend.com>
 */
package akka.stream.impl

import akka.annotation.InternalApi
import akka.stream.Attributes._
import akka.stream._

/**
 * INTERNAL API
 */
@InternalApi private[akka] object Stages {

  object DefaultAttributes {
    // reusable common attributes
    val IODispatcher = ActorAttributes.IODispatcher
    val inputBufferOne = inputBuffer(initial = 1, max = 1)

    // stage specific default attributes
    val fused = name("fused")
    val materializedValueSource = name("matValueSource")
    val map = name("map")
    val log = name("log")
    val filter = name("filter")

    val collect = name("collect")
    val recover = name("recover")
    val mapAsync = name("mapAsync")
    val mapAsyncUnordered = name("mapAsyncUnordered")
    val grouped = name("grouped")
    val groupedWeightedWithin = name("groupedWeightedWithin")
    val limit = name("limit")
    val limitWeighted = name("limitWeighted")
    val sliding = name("sliding")
    val take = name("take")
    val drop = name("drop")
    val takeWhile = name("takeWhile")
    val dropWhile = name("dropWhile")
    val scan = name("scan")
    val scanAsync = name("scanAsync")
    val fold = name("fold")
    val foldAsync = name("foldAsync")
    val reduce = name("reduce")
    val intersperse = name("intersperse")
    val buffer = name("buffer")
    val batch = name("batch")
    val expand = name("expand")
    val statefulMapConcat = name("statefulMapConcat")
    val detacher = name("detacher")
    val groupBy = name("groupBy")
    val prefixAndTail = name("prefixAndTail")
    val split = name("split")
    val concatAll = name("concatAll")
    val processor = name("processor")
    val processorWithKey = name("processorWithKey")
    val identityOp = name("identityOp")
    val delimiterFraming = name("delimiterFraming")

    val initial = name("initial")
    val completion = name("completion")
    val idle = name("idle")
    val idleTimeoutBidi = name("idleTimeoutBidi")
    val delayInitial = name("delayInitial")
    val idleInject = name("idleInject")
    val backpressureTimeout = name("backpressureTimeout")

    val merge = name("merge")
    val mergePreferred = name("mergePreferred")
    val mergePrioritized = name("mergePrioritized")
    val flattenMerge = name("flattenMerge")
    val recoverWith = name("recoverWith")
    val broadcast = name("broadcast")
    val balance = name("balance")
    val zip = name("zip")
    val zipN = name("zipN")
    val zipWithN = name("zipWithN")
    val zipWithIndex = name("zipWithIndex")
    val unzip = name("unzip")
    val concat = name("concat")
    val orElse = name("orElse")
    val unfold = name("unfold")
    val unfoldAsync = name("unfoldAsync")
    val delay = name("delay")

    val terminationWatcher = name("terminationWatcher")

    val publisherSource = name("publisherSource")

    val futureSource = name("futureSource")
    val futureFlattenSource = name("futureFlattenSource")
    val tickSource = name("tickSource")
    val singleSource = name("singleSource")
    val emptySource = name("emptySource")
    val maybeSource = name("MaybeSource")
    val failedSource = name("failedSource")
    val concatSource = name("concatSource")
    val concatMatSource = name("concatMatSource")
    val subscriberSource = name("subscriberSource")
    val actorPublisherSource = name("actorPublisherSource")
    val actorRefSource = name("actorRefSource")
    val queueSource = name("queueSource")
    val inputStreamSource = name("inputStreamSource") and IODispatcher
    val outputStreamSource = name("outputStreamSource") and IODispatcher
    val fileSource = name("fileSource") and IODispatcher
    val unfoldResourceSource = name("unfoldResourceSource") and IODispatcher
    val unfoldResourceSourceAsync = name("unfoldResourceSourceAsync") and IODispatcher
    val asJavaStream = Attributes(IODispatcher)

    val subscriberSink = name("subscriberSink")
    val cancelledSink = name("cancelledSink")
    val seqSink = name("seqSink")
    val publisherSink = name("publisherSink")
    val fanoutPublisherSink = name("fanoutPublisherSink")
    val ignoreSink = name("ignoreSink")
    val actorRefSink = name("actorRefSink")
    val actorRefWithAck = name("actorRefWithAckSink")
    val actorSubscriberSink = name("actorSubscriberSink")
    val queueSink = name("queueSink")
    val lazySink = name("lazySink")
    val lazySource = name("lazySource")
    val outputStreamSink = name("outputStreamSink") and IODispatcher
    val inputStreamSink = name("inputStreamSink") and IODispatcher
    val fileSink = name("fileSink") and IODispatcher
    val fromJavaStream = name("fromJavaStream")
  }

}
