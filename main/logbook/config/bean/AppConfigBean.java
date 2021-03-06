package logbook.config.bean;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.swt.graphics.RGB;

/**
 * アプリケーションの設定
 *
 */
public final class AppConfigBean {

    /** ポート番号 */
    private int listenPort = 8888;

    /** プロキシ利用 */
    private boolean useProxy;

    /** プロキシホスト */
    private String proxyHost = "localhost";

    /** プロキシポート */
    private int proxyPort = 8080;

    /** ウインドウサイズ(width) */
    private int width = 280;

    /** ウインドウサイズ(height) */
    private int height = 420;

    /** 最前面に表示 */
    private boolean onTop = true;

    /** 縮小表示 */
    private boolean minimumLayout;

    /** 音量 */
    private float soundLevel = 0.85f;

    /** 透明度 */
    private int alpha = 255;

    /** 遠征のリマインド */
    private boolean missionRemind = true;

    /** リマインドのインターバル */
    private int remindInterbal = 120;

    /** 遠征入渠をバルーンで通知する */
    private boolean useBalloon = true;

    /** 報告書の保存先 */
    private String reportPath = new File("").getAbsolutePath();

    /** 資源ログの書き込み間隔 */
    private int materialLogInterval = 600;

    /** アップデートチェック */
    private boolean checkUpdate = true;

    /** 終了時に確認する */
    private boolean checkDoit = true;

    /** タスクトレイに格納 */
    private boolean hideWindow;

    /** ローカルループバックアドレスからの接続のみ受け入れる */
    private boolean allowOnlyFromLocalhost = true;

    /** 遠征-1分前に通知する */
    private boolean noticeDeckmission = true;

    /** 入渠-1分前に通知する */
    private boolean noticeNdock = true;

    /** 画面キャプチャ-保存先 */
    private String capturePath = new File("").getAbsolutePath();

    /** 画面キャプチャ-フォーマット */
    private String imageFormat = "jpg";

    /** 画面キャプチャ-画像ファイル名書式 */
    private String imageNameFormat = "yyyy-MM-dd/yyyy-MM-dd HH-mm-ss.SSS";

    /** ウインドウ位置X */
    private int locationX = -1;

    /** ウインドウ位置Y */
    private int locationY = -1;

    /** 補給不足で警告アイコン */
    private boolean warnByNeedSupply = true;

    /** 疲労状態で警告アイコン */
    private boolean warnByCondState = true;

    /** 中破状態で警告アイコン */
    private boolean warnByHalfDamage = true;

    /** 大破状態で致命的アイコン */
    private boolean fatalByBadlyDamage = true;

    /** 大破状態で大破でバルーンツールチップ */
    private boolean balloonBybadlyDamage = true;

    /** 遠征からの帰還時に母港タブを表示 */
    private boolean visibleOnReturnMission = true;

    /** お風呂から上がる時に母港タブを表示 */
    private boolean visibleOnReturnBathwater = true;

    /** モノクロアイコンを使用する */
    private boolean monoIcon;

    /** 回数を表示 */
    private boolean displayCount;

    /** デフォルト海域 */
    private String defaultSea = "3-2";

    /** デフォルト評価 */
    private String defaultEvaluate = "S勝利";

    /** タスクバー通知を使用する */
    private boolean useTaskbarNotify = true;

    /** 母港の空きがこれ以下で警告表示に変える */
    private int notifyFully = 1;

    /** 燃料の色 */
    private RGB fuelColor = new RGB(0x00, 0x80, 0x00);

    /** 弾薬の色 */
    private RGB ammoColor = new RGB(0x66, 0x33, 0x00);

    /** 鋼材の色 */
    private RGB metalColor = new RGB(0x80, 0x80, 0x80);

    /** ボーキの色 */
    private RGB bauxiteColor = new RGB(0xCC, 0x33, 0x00);

    /** テーブル列を表示する設定(キー:java.lang.Class.getName()) */
    private Map<String, boolean[]> visibleColumnMap = new HashMap<>();

    /** ウインドウ位置とサイズ(キー:java.lang.Class.getName()) */
    private Map<String, WindowLocationBean> windowLocationMap = new HashMap<>();

    /** 定期的に再読み込みする設定(キー:java.lang.Class.getName()) */
    private Map<String, Boolean> cyclicReloadMap = new HashMap<>();

    /** ユーザースクリプトを使用する */
    private boolean useUserScript;

    /** ユーザースクリプトパス */
    private String[] userScripts;

    /** スクリプトエンジンパス */
    private String[] scriptEngines;

    /**
     * ポート番号を取得します。
     * @return ポート番号
     */
    public int getListenPort() {
        return this.listenPort;
    }

    /**
     * ポート番号を設定します。
     * @param listenPort ポート番号
     */
    public void setListenPort(int listenPort) {
        this.listenPort = listenPort;
    }

    /**
     * プロキシ利用を取得します。
     * @return プロキシ利用
     */
    public boolean isUseProxy() {
        return this.useProxy;
    }

    /**
     * プロキシ利用を設定します。
     * @param useProxy プロキシ利用
     */
    public void setUseProxy(boolean useProxy) {
        this.useProxy = useProxy;
    }

    /**
     * プロキシホストを取得します。
     * @return プロキシホスト
     */
    public String getProxyHost() {
        return this.proxyHost;
    }

    /**
     * プロキシホストを設定します。
     * @param proxyHost プロキシホスト
     */
    public void setProxyHost(String proxyHost) {
        this.proxyHost = proxyHost;
    }

    /**
     * プロキシポートを取得します。
     * @return プロキシポート
     */
    public int getProxyPort() {
        return this.proxyPort;
    }

    /**
     * プロキシポートを設定します。
     * @param proxyPort プロキシポート
     */
    public void setProxyPort(int proxyPort) {
        this.proxyPort = proxyPort;
    }

    /**
     * ウインドウサイズ(width)を取得します。
     * @return ウインドウサイズ(width)
     */
    public int getWidth() {
        return this.width;
    }

    /**
     * ウインドウサイズ(width)を設定します。
     * @param width ウインドウサイズ(width)
     */
    public void setWidth(int width) {
        this.width = width;
    }

    /**
     * ウインドウサイズ(height)を取得します。
     * @return ウインドウサイズ(height)
     */
    public int getHeight() {
        return this.height;
    }

    /**
     * ウインドウサイズ(height)を設定します。
     * @param height ウインドウサイズ(height)
     */
    public void setHeight(int height) {
        this.height = height;
    }

    /**
     * 最前面に表示を取得します。
     * @return 最前面に表示
     */
    public boolean isOnTop() {
        return this.onTop;
    }

    /**
     * 最前面に表示を設定します。
     * @param onTop 最前面に表示
     */
    public void setOnTop(boolean onTop) {
        this.onTop = onTop;
    }

    /**
     * 縮小表示を取得します。
     * @return 縮小表示
     */
    public boolean isMinimumLayout() {
        return this.minimumLayout;
    }

    /**
     * 縮小表示を設定します。
     * @param minimumLayout 縮小表示
     */
    public void setMinimumLayout(boolean minimumLayout) {
        this.minimumLayout = minimumLayout;
    }

    /**
     * 音量を取得します。
     * @return 音量
     */
    public float getSoundLevel() {
        return this.soundLevel;
    }

    /**
     * 音量を設定します。
     * @param soundLevel 音量
     */
    public void setSoundLevel(float soundLevel) {
        this.soundLevel = soundLevel;
    }

    /**
     * 透明度を取得します。
     * @return 透明度
     */
    public int getAlpha() {
        return this.alpha;
    }

    /**
     * 透明度を設定します。
     * @param alpha 透明度
     */
    public void setAlpha(int alpha) {
        this.alpha = alpha;
    }

    /**
     * 遠征のリマインドを取得します。
     * @return 遠征のリマインド
     */
    public boolean isMissionRemind() {
        return this.missionRemind;
    }

    /**
     * 遠征のリマインドを設定します。
     * @param missionRemind 遠征のリマインド
     */
    public void setMissionRemind(boolean missionRemind) {
        this.missionRemind = missionRemind;
    }

    /**
     * リマインドのインターバルを取得します。
     * @return リマインドのインターバル
     */
    public int getRemindInterbal() {
        return this.remindInterbal;
    }

    /**
     * リマインドのインターバルを設定します。
     * @param remindInterbal リマインドのインターバル
     */
    public void setRemindInterbal(int remindInterbal) {
        this.remindInterbal = remindInterbal;
    }

    /**
     * 遠征入渠をバルーンで通知するを取得します。
     * @return 遠征入渠をバルーンで通知する
     */
    public boolean isUseBalloon() {
        return this.useBalloon;
    }

    /**
     * 遠征入渠をバルーンで通知するを設定します。
     * @param useBalloon 遠征入渠をバルーンで通知する
     */
    public void setUseBalloon(boolean useBalloon) {
        this.useBalloon = useBalloon;
    }

    /**
     * 報告書の保存先を取得します。
     * @return 報告書の保存先
     */
    public String getReportPath() {
        return this.reportPath;
    }

    /**
     * 報告書の保存先を設定します。
     * @param reportPath 報告書の保存先
     */
    public void setReportPath(String reportPath) {
        this.reportPath = reportPath;
    }

    /**
     * 資源ログの書き込み間隔を取得します。
     * @return 資源ログの書き込み間隔
     */
    public int getMaterialLogInterval() {
        return this.materialLogInterval;
    }

    /**
     * 資源ログの書き込み間隔を設定します。
     * @param materialLogInterval 資源ログの書き込み間隔
     */
    public void setMaterialLogInterval(int materialLogInterval) {
        this.materialLogInterval = materialLogInterval;
    }

    /**
     * アップデートチェックを取得します。
     * @return アップデートチェック
     */
    public boolean isCheckUpdate() {
        return this.checkUpdate;
    }

    /**
     * アップデートチェックを設定します。
     * @param checkUpdate アップデートチェック
     */
    public void setCheckUpdate(boolean checkUpdate) {
        this.checkUpdate = checkUpdate;
    }

    /**
     * 終了時に確認するを取得します。
     * @return 終了時に確認する
     */
    public boolean isCheckDoit() {
        return this.checkDoit;
    }

    /**
     * 終了時に確認するを設定します。
     * @param checkDoit 終了時に確認する
     */
    public void setCheckDoit(boolean checkDoit) {
        this.checkDoit = checkDoit;
    }

    /**
     * タスクトレイに格納を取得します。
     * @return タスクトレイに格納
     */
    public boolean isHideWindow() {
        return this.hideWindow;
    }

    /**
     * タスクトレイに格納を設定します。
     * @param hideWindow タスクトレイに格納
     */
    public void setHideWindow(boolean hideWindow) {
        this.hideWindow = hideWindow;
    }

    /**
     * ローカルループバックアドレスからの接続のみ受け入れるを取得します。
     * @return ローカルループバックアドレスからの接続のみ受け入れる
     */
    public boolean isAllowOnlyFromLocalhost() {
        return this.allowOnlyFromLocalhost;
    }

    /**
     * ローカルループバックアドレスからの接続のみ受け入れるを設定します。
     * @param allowOnlyFromLocalhost ローカルループバックアドレスからの接続のみ受け入れる
     */
    public void setAllowOnlyFromLocalhost(boolean allowOnlyFromLocalhost) {
        this.allowOnlyFromLocalhost = allowOnlyFromLocalhost;
    }

    /**
     * 遠征-1分前に通知するを取得します。
     * @return 遠征-1分前に通知する
     */
    public boolean isNoticeDeckmission() {
        return this.noticeDeckmission;
    }

    /**
     * 遠征-1分前に通知するを設定します。
     * @param noticeDeckmission 遠征-1分前に通知する
     */
    public void setNoticeDeckmission(boolean noticeDeckmission) {
        this.noticeDeckmission = noticeDeckmission;
    }

    /**
     * 入渠-1分前に通知するを取得します。
     * @return 入渠-1分前に通知する
     */
    public boolean isNoticeNdock() {
        return this.noticeNdock;
    }

    /**
     * 入渠-1分前に通知するを設定します。
     * @param noticeNdock 入渠-1分前に通知する
     */
    public void setNoticeNdock(boolean noticeNdock) {
        this.noticeNdock = noticeNdock;
    }

    /**
     * 画面キャプチャ-保存先を取得します。
     * @return 画面キャプチャ-保存先
     */
    public String getCapturePath() {
        return this.capturePath;
    }

    /**
     * 画面キャプチャ-保存先を設定します。
     * @param capturePath 画面キャプチャ-保存先
     */
    public void setCapturePath(String capturePath) {
        this.capturePath = capturePath;
    }

    /**
     * 画面キャプチャ-フォーマットを取得します。
     * @return 画面キャプチャ-フォーマット
     */
    public String getImageFormat() {
        return this.imageFormat;
    }

    /**
     * 画面キャプチャ-フォーマットを設定します。
     * @param imageFormat 画面キャプチャ-フォーマット
     */
    public void setImageFormat(String imageFormat) {
        this.imageFormat = imageFormat;
    }

    /**
     * 画面キャプチャ-画像ファイル名書式を取得します。
     * @return 画面キャプチャ-画像ファイル名書式
     */
    public String getImageNameFormat() {
        return this.imageNameFormat;
    }

    /**
     * 画面キャプチャ-画像ファイル名書式を設定します。
     * @param imageNameFormat 画面キャプチャ-画像ファイル名書式
     */
    public void setImageNameFormat(String imageNameFormat) {
        this.imageNameFormat = imageNameFormat;
    }

    /**
     * ウインドウ位置Xを取得します。
     * @return ウインドウ位置X
     */
    public int getLocationX() {
        return this.locationX;
    }

    /**
     * ウインドウ位置Xを設定します。
     * @param locationX ウインドウ位置X
     */
    public void setLocationX(int locationX) {
        this.locationX = locationX;
    }

    /**
     * ウインドウ位置Yを取得します。
     * @return ウインドウ位置Y
     */
    public int getLocationY() {
        return this.locationY;
    }

    /**
     * ウインドウ位置Yを設定します。
     * @param locationY ウインドウ位置Y
     */
    public void setLocationY(int locationY) {
        this.locationY = locationY;
    }

    /**
     * 補給不足で警告アイコンを取得します。
     * @return 補給不足で警告アイコン
     */
    public boolean isWarnByNeedSupply() {
        return this.warnByNeedSupply;
    }

    /**
     * 補給不足で警告アイコンを設定します。
     * @param warnByNeedSupply 補給不足で警告アイコン
     */
    public void setWarnByNeedSupply(boolean warnByNeedSupply) {
        this.warnByNeedSupply = warnByNeedSupply;
    }

    /**
     * 疲労状態で警告アイコンを取得します。
     * @return 疲労状態で警告アイコン
     */
    public boolean isWarnByCondState() {
        return this.warnByCondState;
    }

    /**
     * 疲労状態で警告アイコンを設定します。
     * @param warnByCondState 疲労状態で警告アイコン
     */
    public void setWarnByCondState(boolean warnByCondState) {
        this.warnByCondState = warnByCondState;
    }

    /**
     * 大破状態で致命的アイコンを取得します。
     * @return 大破状態で致命的アイコン
     */
    public boolean isFatalBybadlyDamage() {
        return this.fatalByBadlyDamage;
    }

    /**
     * 大破状態で致命的アイコンを設定します。
     * @param fatalBybadlyDamage 大破状態で致命的アイコン
     */
    public void setFatalBybadlyDamage(boolean fatalBybadlyDamage) {
        this.fatalByBadlyDamage = fatalBybadlyDamage;
    }

    /**
     * 中破状態で警告アイコンを取得します。
     * @return 中破状態で警告アイコン
     */
    public boolean isWarnByHalfDamage() {
        return this.warnByHalfDamage;
    }

    /**
     * 中破状態で警告アイコンを設定します。
     * @param warnByHalfDamage 中破状態で警告アイコン
     */
    public void setWarnByHalfDamage(boolean warnByHalfDamage) {
        this.warnByHalfDamage = warnByHalfDamage;
    }

    /**
     * 大破状態で致命的アイコンを取得します。
     * @return 大破状態で致命的アイコン
     */
    public boolean isFatalByBadlyDamage() {
        return this.fatalByBadlyDamage;
    }

    /**
     * 大破状態で致命的アイコンを設定します。
     * @param fatalByBadlyDamage 大破状態で致命的アイコン
     */
    public void setFatalByBadlyDamage(boolean fatalByBadlyDamage) {
        this.fatalByBadlyDamage = fatalByBadlyDamage;
    }

    /**
     * 大破状態で大破でバルーンツールチップを取得します。
     * @return 大破状態で大破でバルーンツールチップ
     */
    public boolean isBalloonBybadlyDamage() {
        return this.balloonBybadlyDamage;
    }

    /**
     * 大破状態で大破でバルーンツールチップを設定します。
     * @param balloonBybadlyDamage 大破状態で大破でバルーンツールチップ
     */
    public void setBalloonBybadlyDamage(boolean balloonBybadlyDamage) {
        this.balloonBybadlyDamage = balloonBybadlyDamage;
    }

    /**
     * 遠征からの帰還時に母港タブを表示を取得します。
     * @return 遠征からの帰還時に母港タブを表示
     */
    public boolean isVisibleOnReturnMission() {
        return this.visibleOnReturnMission;
    }

    /**
     * 遠征からの帰還時に母港タブを表示を設定します。
     * @param visibleOnReturnMission 遠征からの帰還時に母港タブを表示
     */
    public void setVisibleOnReturnMission(boolean visibleOnReturnMission) {
        this.visibleOnReturnMission = visibleOnReturnMission;
    }

    /**
     * お風呂から上がる時に母港タブを表示を取得します。
     * @return お風呂から上がる時に母港タブを表示
     */
    public boolean isVisibleOnReturnBathwater() {
        return this.visibleOnReturnBathwater;
    }

    /**
     * お風呂から上がる時に母港タブを表示を設定します。
     * @param visibleOnReturnBathwater お風呂から上がる時に母港タブを表示
     */
    public void setVisibleOnReturnBathwater(boolean visibleOnReturnBathwater) {
        this.visibleOnReturnBathwater = visibleOnReturnBathwater;
    }

    /**
     * モノクロアイコンを使用するを取得します。
     * @return モノクロアイコンを使用する
     */
    public boolean isMonoIcon() {
        return this.monoIcon;
    }

    /**
     * モノクロアイコンを使用するを設定します。
     * @param monoIcon モノクロアイコンを使用する
     */
    public void setMonoIcon(boolean monoIcon) {
        this.monoIcon = monoIcon;
    }

    /**
     * 回数を表示を取得します。
     * @return 回数を表示
     */
    public boolean isDisplayCount() {
        return this.displayCount;
    }

    /**
     * 回数を表示を設定します。
     * @param displayCount 回数を表示
     */
    public void setDisplayCount(boolean displayCount) {
        this.displayCount = displayCount;
    }

    /**
     * デフォルト海域を取得します。
     * @return デフォルト海域
     */
    public String getDefaultSea() {
        return this.defaultSea;
    }

    /**
     * デフォルト海域を設定します。
     * @param defaultSea デフォルト海域
     */
    public void setDefaultSea(String defaultSea) {
        this.defaultSea = defaultSea;
    }

    /**
     * デフォルト評価を取得します。
     * @return デフォルト評価
     */
    public String getDefaultEvaluate() {
        return this.defaultEvaluate;
    }

    /**
     * デフォルト評価を設定します。
     * @param defaultEvaluate デフォルト評価
     */
    public void setDefaultEvaluate(String defaultEvaluate) {
        this.defaultEvaluate = defaultEvaluate;
    }

    /**
     * タスクバー通知を使用するを取得します。
     * @return タスクバー通知を使用する
     */
    public boolean isUseTaskbarNotify() {
        return this.useTaskbarNotify;
    }

    /**
     * タスクバー通知を使用するを設定します。
     * @param useTaskbarNotify タスクバー通知を使用する
     */
    public void setUseTaskbarNotify(boolean useTaskbarNotify) {
        this.useTaskbarNotify = useTaskbarNotify;
    }

    /**
     * 母港の空きがこれ以下で警告表示に変えるを取得します。
     * @return 母港の空きがこれ以下で警告表示に変える
     */
    public int getNotifyFully() {
        return this.notifyFully;
    }

    /**
     * 母港の空きがこれ以下で警告表示に変えるを設定します。
     * @param notifyFully 母港の空きがこれ以下で警告表示に変える
     */
    public void setNotifyFully(int notifyFully) {
        this.notifyFully = notifyFully;
    }

    /**
     * 燃料の色を取得します。
     * @return 燃料の色
     */
    public RGB getFuelColor() {
        return this.fuelColor;
    }

    /**
     * 燃料の色を設定します。
     * @param fuelColor 燃料の色
     */
    public void setFuelColor(RGB fuelColor) {
        this.fuelColor = fuelColor;
    }

    /**
     * 弾薬の色を取得します。
     * @return 弾薬の色
     */
    public RGB getAmmoColor() {
        return this.ammoColor;
    }

    /**
     * 弾薬の色を設定します。
     * @param ammoColor 弾薬の色
     */
    public void setAmmoColor(RGB ammoColor) {
        this.ammoColor = ammoColor;
    }

    /**
     * 鋼材の色を取得します。
     * @return 鋼材の色
     */
    public RGB getMetalColor() {
        return this.metalColor;
    }

    /**
     * 鋼材の色を設定します。
     * @param metalColor 鋼材の色
     */
    public void setMetalColor(RGB metalColor) {
        this.metalColor = metalColor;
    }

    /**
     * ボーキの色を取得します。
     * @return ボーキの色
     */
    public RGB getBauxiteColor() {
        return this.bauxiteColor;
    }

    /**
     * ボーキの色を設定します。
     * @param bauxiteColor ボーキの色
     */
    public void setBauxiteColor(RGB bauxiteColor) {
        this.bauxiteColor = bauxiteColor;
    }

    /**
     * テーブル列を表示する設定(キー:java.lang.Class.getName())を取得します。
     * @return テーブル列を表示する設定(キー:java.lang.Class.getName())
     */
    public Map<String, boolean[]> getVisibleColumnMap() {
        return this.visibleColumnMap;
    }

    /**
     * テーブル列を表示する設定(キー:java.lang.Class.getName())を設定します。
     * @param visibleColumnMap テーブル列を表示する設定(キー:java.lang.Class.getName())
     */
    public void setVisibleColumnMap(Map<String, boolean[]> visibleColumnMap) {
        this.visibleColumnMap = visibleColumnMap;
    }

    /**
     * ウインドウ位置とサイズ(キー:java.lang.Class.getName())を取得します。
     * @return ウインドウ位置とサイズ(キー:java.lang.Class.getName())
     */
    public Map<String, WindowLocationBean> getWindowLocationMap() {
        return this.windowLocationMap;
    }

    /**
     * ウインドウ位置とサイズ(キー:java.lang.Class.getName())を設定します。
     * @param windowLocationMap ウインドウ位置とサイズ(キー:java.lang.Class.getName())
     */
    public void setWindowLocationMap(Map<String, WindowLocationBean> windowLocationMap) {
        this.windowLocationMap = windowLocationMap;
    }

    /**
     * 定期的に再読み込みする設定(キー:java.lang.Class.getName())を取得します。
     * @return 定期的に再読み込みする設定(キー:java.lang.Class.getName())
     */
    public Map<String, Boolean> getCyclicReloadMap() {
        return this.cyclicReloadMap;
    }

    /**
     * 定期的に再読み込みする設定(キー:java.lang.Class.getName())を設定します。
     * @param cyclicReloadMap 定期的に再読み込みする設定(キー:java.lang.Class.getName())
     */
    public void setCyclicReloadMap(Map<String, Boolean> cyclicReloadMap) {
        this.cyclicReloadMap = cyclicReloadMap;
    }

    /**
     * ユーザースクリプトを使用するを取得します。
     * @return ユーザースクリプトを使用する
     */
    public boolean isUseUserScript() {
        return this.useUserScript;
    }

    /**
     * ユーザースクリプトを使用するを設定します。
     * @param useUserScript ユーザースクリプトを使用する
     */
    public void setUseUserScript(boolean useUserScript) {
        this.useUserScript = useUserScript;
    }

    /**
     * ユーザースクリプトパスを取得します。
     * @return ユーザースクリプトパス
     */
    public String[] getUserScripts() {
        return this.userScripts;
    }

    /**
     * ユーザースクリプトパスを設定します。
     * @param userScripts ユーザースクリプトパス
     */
    public void setUserScripts(String[] userScripts) {
        this.userScripts = userScripts;
    }

    /**
     * スクリプトエンジンパスを取得します。
     * @return スクリプトエンジンパス
     */
    public String[] getScriptEngines() {
        return this.scriptEngines;
    }

    /**
     * スクリプトエンジンパスを設定します。
     * @param scriptEngines スクリプトエンジンパス
     */
    public void setScriptEngines(String[] scriptEngines) {
        this.scriptEngines = scriptEngines;
    }

}
