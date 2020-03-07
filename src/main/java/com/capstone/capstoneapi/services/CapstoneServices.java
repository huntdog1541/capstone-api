package com.capstone.capstoneapi.services;

import capstone.Capstone;
import com.capstone.capstoneapi.model.CapstoneRequest;

public class CapstoneServices {

    public boolean execute(CapstoneRequest request)
    {
        boolean isSuccessful = false;
        Capstone capstone = new Capstone(Capstone.CS_ARCH_X86, Capstone.CS_MODE_64);
        capstone.setDetail(Capstone.CS_OPT_ON);
        capstone.setSyntax(Capstone.CS_OPT_SYNTAX_INTEL);
        //Capstone.CsInsn[] all_ins = capstone.disasm();

        capstone.close();
        return isSuccessful;
    }
}
