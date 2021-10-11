package com.jydev.jobplanetandroid

import com.jydev.util.getCommaDecimal
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import java.util.stream.Stream


class DecimalUtilTest {

    @DisplayName("숫자가 입력되었을때 천단위로 ,찍어줘야함")
    @ParameterizedTest(name = "Input Number : {1}, Result : {0}")
    @MethodSource("provideDecimalUtilTestValue")
    fun testDecimalUtil(result : String,number: Int) {
        assert(result == number.getCommaDecimal())
    }

    companion object{
        @JvmStatic
        fun provideDecimalUtilTestValue(): Stream<Arguments> =
            Stream.of(
                Arguments.of("1,000", 1000),
                Arguments.of("2,000", 2000),
                Arguments.of("3,000", 3000)
            )
    }



}