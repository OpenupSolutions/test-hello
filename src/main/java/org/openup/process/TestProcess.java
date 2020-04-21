package org.openup.process;

import org.compiere.process.SvrProcess;

public class TestProcess extends SvrProcess {
	@Override
	protected void prepare() {

	}

	@Override
	protected String doIt() throws Exception {
		log.info("doing...");
		log.info("done!");
		return "OK";
	}
}
