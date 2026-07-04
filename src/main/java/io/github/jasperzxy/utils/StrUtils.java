package io.github.jasperzxy.utils;

/**
 * 字符串工具类，提供常用的字符串操作方法。
 * <p>
 * 该类为工具类，不可实例化，所有方法均为静态方法。
 * </p>
 *
 * @author zxy-utils
 * @since 1.0.0
 */
public class StrUtils {

    /**
     * 私有构造方法，防止工具类被实例化。
     */
    private StrUtils() {
    }

    /**
     * 判断字符串是否为空。
     * <p>
     * 空的定义：字符串为 {@code null} 或长度为 0。
     * </p>
     * 
     * <pre>
     * StrUtils.isEmpty(null)   = true
     * StrUtils.isEmpty("")     = true
     * StrUtils.isEmpty(" ")    = false
     * StrUtils.isEmpty("abc")  = false
     * </pre>
     *
     * @param str 待判断的字符串
     * @return 如果字符串为 {@code null} 或长度为 0 则返回 {@code true}，否则返回 {@code false}
     */
    public static boolean isEmpty(String str) {
        return str == null || str.length() == 0;
    }

    /**
     * 判断字符串是否不为空。
     * <p>
     * 该方法是 {@link #isEmpty(String)} 的取反。
     * </p>
     * 
     * <pre>
     * StrUtils.isNotEmpty(null)   = false
     * StrUtils.isNotEmpty("")     = false
     * StrUtils.isNotEmpty(" ")    = true
     * StrUtils.isNotEmpty("abc")  = true
     * </pre>
     *
     * @param str 待判断的字符串
     * @return 如果字符串不为 {@code null} 且长度大于 0 则返回 {@code true}，否则返回 {@code false}
     * @see #isEmpty(String)
     */
    public static boolean isNotEmpty(String str) {
        return !isEmpty(str);
    }

    /**
     * 判断字符串是否为空白。
     * <p>
     * 空白的定义：字符串为 {@code null}、长度为 0，或仅包含空白字符（空格、制表符、换行符等）。
     * </p>
     * 
     * <pre>
     * StrUtils.isBlank(null)    = true
     * StrUtils.isBlank("")      = true
     * StrUtils.isBlank(" ")     = true
     * StrUtils.isBlank("  ")    = true
     * StrUtils.isBlank("\t")    = true
     * StrUtils.isBlank("\n")    = true
     * StrUtils.isBlank("abc")   = false
     * StrUtils.isBlank(" a ")   = false
     * </pre>
     *
     * @param str 待判断的字符串
     * @return 如果字符串为空白则返回 {@code true}，否则返回 {@code false}
     * @see Character#isWhitespace(char)
     */
    public static boolean isBlank(String str) {
        if (str == null || str.length() == 0) {
            return true;
        }
        for (int i = 0; i < str.length(); i++) {
            if (!Character.isWhitespace(str.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    /**
     * 判断字符串是否不为空白。
     * <p>
     * 该方法是 {@link #isBlank(String)} 的取反。
     * </p>
     * 
     * <pre>
     * StrUtils.isNotBlank(null)    = false
     * StrUtils.isNotBlank("")      = false
     * StrUtils.isNotBlank(" ")     = false
     * StrUtils.isNotBlank("abc")   = true
     * StrUtils.isNotBlank(" a ")   = true
     * </pre>
     *
     * @param str 待判断的字符串
     * @return 如果字符串不为空白则返回 {@code true}，否则返回 {@code false}
     * @see #isBlank(String)
     */
    public static boolean isNotBlank(String str) {
        return !isBlank(str);
    }

    /**
     * 反转字符串。
     * <p>
     * 如果输入字符串为 {@code null} 或空字符串，则直接返回原字符串。
     * </p>
     * 
     * <pre>
     * StrUtils.reverse(null)    = null
     * StrUtils.reverse("")      = ""
     * StrUtils.reverse("a")     = "a"
     * StrUtils.reverse("abc")   = "cba"
     * StrUtils.reverse("abc123") = "321cba"
     * </pre>
     *
     * @param str 待反转的字符串
     * @return 反转后的字符串，如果输入为 {@code null} 则返回 {@code null}
     */
    public static String reverse(String str) {
        if (isEmpty(str)) {
            return str;
        }
        return new StringBuilder(str).reverse().toString();
    }

    /**
     * 将字符串首字母大写。
     * <p>
     * 如果输入字符串为 {@code null} 或空字符串，则直接返回原字符串。
     * </p>
     * 
     * <pre>
     * StrUtils.capitalize(null)    = null
     * StrUtils.capitalize("")      = ""
     * StrUtils.capitalize("a")     = "A"
     * StrUtils.capitalize("abc")   = "Abc"
     * StrUtils.capitalize("ABC")   = "ABC"
     * </pre>
     *
     * @param str 待处理的字符串
     * @return 首字母大写后的字符串，如果输入为 {@code null} 则返回 {@code null}
     * @see Character#toUpperCase(char)
     */
    public static String capitalize(String str) {
        if (isEmpty(str)) {
            return str;
        }
        return Character.toUpperCase(str.charAt(0)) + str.substring(1);
    }

    /**
     * 将字符串首字母小写。
     * <p>
     * 如果输入字符串为 {@code null} 或空字符串，则直接返回原字符串。
     * </p>
     * 
     * <pre>
     * StrUtils.uncapitalize(null)    = null
     * StrUtils.uncapitalize("")      = ""
     * StrUtils.uncapitalize("A")     = "a"
     * StrUtils.uncapitalize("Abc")   = "abc"
     * StrUtils.uncapitalize("ABC")   = "aBC"
     * </pre>
     *
     * @param str 待处理的字符串
     * @return 首字母小写后的字符串，如果输入为 {@code null} 则返回 {@code null}
     * @see Character#toLowerCase(char)
     */
    public static String uncapitalize(String str) {
        if (isEmpty(str)) {
            return str;
        }
        return Character.toLowerCase(str.charAt(0)) + str.substring(1);
    }
}
