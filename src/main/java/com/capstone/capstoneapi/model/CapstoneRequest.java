package com.capstone.capstoneapi.model;

import capstone.Capstone;
import com.capstone.capstoneapi.Utils.CapstoneUtils;
import com.fasterxml.jackson.annotation.JsonProperty;

public class CapstoneRequest {

    @JsonProperty("architecture")
    private String architecture;
    @JsonProperty("mode")
    private String mode;
    @JsonProperty("code")
    private String code;
    @JsonProperty("syntax")
    private String syntax;

    private int arch_num;
    private int mode_num;


    public void updateValues()
    {
        arch_num = CapstoneUtils.getArchitecture(architecture);
        mode_num = CapstoneUtils.getMode(mode);
    }

    public String getArchitecture() {
        return architecture;
    }

    public void setArchitecture(String architecture) {
        this.architecture = architecture;
    }

    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getSyntax() {
        return syntax;
    }

    public void setSyntax(String syntax) {
        this.syntax = syntax;
    }

    public int getArch_num() {
        return arch_num;
    }

    public void setArch_num(int arch_num) {
        this.arch_num = arch_num;
    }

    public int getMode_num() {
        return mode_num;
    }

    public void setMode_num(int mode_num) {
        this.mode_num = mode_num;
    }
}
