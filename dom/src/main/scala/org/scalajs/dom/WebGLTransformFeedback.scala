/*
 * Copyright (C) 2014 Matt Seddon.  This source is donated in full to the scala-js-dom project.
 *
 * Based on https://www.khronos.org/registry/webgl/specs/1.0/
 */

package org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation._

/** An opaque type that enables transform feedback, which is the process of capturing primitives generated by vertex
  * processing. It allows to preserve the post-transform rendering state of an object and resubmit this data multiple
  * times.
  */
@js.native
@JSGlobal
class WebGLTransformFeedback private[this] () extends js.Object
