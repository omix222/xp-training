package com.company.xp;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.*;

/**
 * StringCalculatorのテストクラス
 *
 * リファクタリング練習:
 * - 機能を段階的に追加
 * - 各段階でテストが通ることを確認
 * - 定期的にコードをリファクタリング
 * - テストが壊れないことを確認
 */
@DisplayName("StringCalculator リファクタリング練習")
class StringCalculatorTest {

    private StringCalculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new StringCalculator();
    }

    // ステップ1のテスト
    @Test
    @DisplayName("空文字列は0を返す")
    void shouldReturn0ForEmptyString() {
        // TODO: assertEquals(0, calculator.add(""));
    }

    // ステップ2のテスト
    @Test
    @DisplayName("1つの数字を正しく処理する")
    void shouldReturnNumberForSingleNumber() {
        // TODO: assertEquals(1, calculator.add("1"));
        // TODO: assertEquals(5, calculator.add("5"));
    }

    // ステップ3のテスト
    @Test
    @DisplayName("カンマ区切りの数字を合計する")
    void shouldAddCommaSeparatedNumbers() {
        // TODO: assertEquals(3, calculator.add("1,2"));
        // TODO: assertEquals(6, calculator.add("1,2,3"));
    }

    // ステップ4のテスト
    @Test
    @DisplayName("改行文字も区切り文字として処理する")
    void shouldHandleNewlineAsDelimiter() {
        // TODO: assertEquals(6, calculator.add("1\n2,3"));
    }

    // ステップ5のテスト
    @Test
    @DisplayName("カスタム区切り文字に対応する")
    void shouldSupportCustomDelimiter() {
        // TODO: assertEquals(3, calculator.add("//;\n1;2"));
        // TODO: assertEquals(10, calculator.add("//|\n2|3|5"));
    }

    // ステップ6のテスト
    @Test
    @DisplayName("負の数が含まれる場合は例外を投げる")
    void shouldThrowExceptionForNegativeNumbers() {
        // TODO: IllegalArgumentException exception = assertThrows(IllegalArgumentException.class,
        //       () -> calculator.add("1,-2,3"));
        // TODO: assertTrue(exception.getMessage().contains("-2"));
    }

    @Test
    @DisplayName("複数の負の数がある場合、すべてをエラーメッセージに含める")
    void shouldIncludeAllNegativeNumbersInExceptionMessage() {
        // TODO: 複数の負の数のテスト
    }

    // ステップ7のテスト
    @Test
    @DisplayName("1000以上の数字は無視する")
    void shouldIgnoreNumbersGreaterThan1000() {
        // TODO: assertEquals(1001, calculator.add("1000,1001,1"));
    }

    // リファクタリング後の統合テスト
    @Test
    @DisplayName("すべての要件を組み合わせた複雑なケース")
    void shouldHandleComplexCase() {
        // TODO: カスタム区切り文字、1000以上の数字の無視、通常の計算を組み合わせたテスト
    }
}