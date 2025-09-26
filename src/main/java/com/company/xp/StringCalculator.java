package com.company.xp;

/**
 * StringCalculator - リファクタリング練習問題3
 *
 * 要件:
 * - 文字列形式の数字を受け取り、合計を返す
 * - カンマ区切りの数字をサポート
 * - カスタム区切り文字をサポート
 * - 負の数は受け付けない（例外を投げる）
 * - 1000以上の数字は無視する
 *
 * XPプラクティス:
 * - Refactoring
 * - Simple Design
 * - Small Releases（機能を段階的に追加）
 */
public class StringCalculator {

    public int add(String numbers) {
        // TODO: 段階的に機能を実装し、定期的にリファクタリングしてください
        //
        // ステップ1: 空文字列は0を返す
        // ステップ2: 1つの数字を処理
        // ステップ3: カンマ区切りの複数の数字を処理
        // ステップ4: 改行文字も区切り文字として対応
        // ステップ5: カスタム区切り文字に対応
        // ステップ6: 負の数の検証
        // ステップ7: 1000以上の数字を無視

        throw new UnsupportedOperationException("Not implemented yet");
    }

    // ヘルパーメソッドを追加する際のリファクタリング例
    private String[] parseDelimiters(String numbers) {
        // TODO: リファクタリング時に抽出されるメソッド
        throw new UnsupportedOperationException("Not implemented yet");
    }

    private void validateNumbers(String[] numberArray) {
        // TODO: リファクタリング時に抽出されるメソッド
        throw new UnsupportedOperationException("Not implemented yet");
    }
}