package com.continuum.app

import kotlin.test.Test
import kotlin.test.assertEquals

class RequestHandlerTest {
    @Test
    fun handlesHealthCheck() {
        val handler = RequestHandler(ProcessingService("continuum-payment-return-outbound"))

        assertEquals("continuum-payment-return-outbound processed: health-check", handler.handle("health-check"))
    }
}