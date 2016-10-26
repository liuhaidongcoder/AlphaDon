/**
 * 
 */
package com.alphadon.conf;

/**
 * 配置文件路径类
 *
 * @author Zhong Shuai
 * 2014年11月20日
 */
public class ConfigurePath {

	/**
	 * 当前工程jar包路径
	 */
	public static final String CURRENT_PATH = Path.getCurrentPath();


	/**
	 * 配置文件目录
	 */
	public static final String CONFIGURE_PATH = CURRENT_PATH + "/config";

	/**
	 * log4j配置路径
	 */
	public static String LOG4J_PATH = CONFIGURE_PATH + "/log4j.properties";

	/**
	 * wtable配置路径
	 */
	public static String WTABLE_PATH = CONFIGURE_PATH + "/wtable.properties";
	/**
	 * SCF配置路径
	 */
	public static String SCFCONFIG_PATH = CONFIGURE_PATH + "/scf.config";


}
