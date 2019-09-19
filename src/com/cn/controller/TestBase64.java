package com.cn.controller;

import com.cn.ui.JFUI;
import com.cn.util.base64.DESUI;

public class TestBase64 {

    public static void main(String[] args) {

        JFUI jfui = new JFUI();
        jfui.addJDUI(new DESUI());
        jfui.setVisible(true);

    }
}
