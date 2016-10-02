/*
 * Copyright (C) HAT Data Exchange Ltd - All Rights Reserved
 *  Unauthorized copying of this file, via any medium is strictly prohibited
 *  Proprietary and confidential
 *  Written by Andrius Aucinas <andrius.aucinas@hatdex.org>, 10 2016
 */

package org.hatdex.marketsquare.api.services

import javax.inject.Inject

import play.api.libs.ws.WSClient

class MarketsquareClient(val ws: WSClient, val marketsquareAddress: String, override val schema: String) extends MarketsquareOffers {
  @Inject def this(ws: WSClient, hatAddress: String) = this(ws, hatAddress, "https://")

  val logger = play.api.Logger(this.getClass)
}