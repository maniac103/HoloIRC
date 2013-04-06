package com.fusionx.lightirc.listeners;

import org.pircbotx.hooks.Listener;
import org.pircbotx.hooks.ListenerAdapter;

import com.fusionx.lightirc.misc.LightPircBotX;
import com.fusionx.lightirc.services.IRCService;

public abstract class IRCListener extends ListenerAdapter<LightPircBotX>
		implements Listener<LightPircBotX> {
	private IRCService mService;

	protected IRCService getService() {
		return mService;
	}

	public void setService(IRCService service) {
		mService = service;
	}
}