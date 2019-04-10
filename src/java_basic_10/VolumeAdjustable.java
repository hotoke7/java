package java_basic_10;

/**
 * 音量の操作を表すインターフェース
 */
public interface VolumeAdjustable {

    /**
     * 音量を上げることを示す抽象メソッド
     */
    void volumeUp();

    /**
     * 音量を下げる動作を示す抽象メソッド
     */
    void volumeDown();
}
