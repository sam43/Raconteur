package io.raconteur.core

import org.junit.Assert.assertEquals
import org.junit.Test

class ResultTest {
    @Test
    fun `success holds data`() {
        val success = Result.Success(42)
        assertEquals(42, success.data)
    }
}

