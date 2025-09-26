package com.company.xp;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Calculatorのテストクラス
 *
 * ペアプログラミング練習:
 * - ドライバー（コードを書く人）とナビゲーター（指示・レビューする人）を交代しながら実装
 * - 5-10分間隔でロールを交代
 * - コミュニケーションを重視
 */
@DisplayName("Calculator ペアプログラミング練習")
class CalculatorTest {

    private Calculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }

    @Test
    @DisplayName("足し算が正しく動作する")
    void shouldAddTwoNumbers() {
        // TODO: ペアプログラミングでテストを実装してください
        // assertEquals(5.0, calculator.add(2.0, 3.0));
    }

    @Test
    @DisplayName("引き算が正しく動作する")
    void shouldSubtractTwoNumbers() {
        // TODO: ペアプログラミングでテストを実装してください
    }

    @Test
    @DisplayName("掛け算が正しく動作する")
    void shouldMultiplyTwoNumbers() {
        // TODO: ペアプログラミングでテストを実装してください
    }

    @Test
    @DisplayName("割り算が正しく動作する")
    void shouldDivideTwoNumbers() {
        // TODO: ペアプログラミングでテストを実装してください
    }

    @Test
    @DisplayName("0除算時に適切な例外が発生する")
    void shouldThrowExceptionWhenDividingByZero() {
        // TODO: 例外テストを実装してください
        // assertThrows(ArithmeticException.class, () -> calculator.divide(5.0, 0.0));
    }

    @Test
    @DisplayName("メモリ機能が正しく動作する")
    void shouldSaveAndRecallFromMemory() {
        // TODO: メモリ機能のテストを実装してください
    }

    @Test
    @DisplayName("メモリクリア機能が正しく動作する")
    void shouldClearMemory() {
        // TODO: メモリクリアのテストを実装してください
    }
}