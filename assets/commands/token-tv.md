# TAGLINE

Show AI usage limits on a small Wi-Fi desk clock

# TLDR

**Find** the clock and the signed-in tools, then run

```token-tv start```

Render every face with **sample** data, no clock required

```token-tv demo```

Write a **config** without overwriting one that exists

```token-tv setup```

**Check** that each account's login is present

```token-tv doctor```

Ask each provider **now**

```token-tv doctor --live```

**Start with the computer**

```token-tv autostart on```

# SYNOPSIS

**token-tv** [_options_] _command_ [_options_]

# PARAMETERS

**--version**
> Print the version and exit.

**--config** _path_
> Config file. The default is **config.json** under the token-tv directory in the XDG config home, or **~/.config** when that variable is unset.

**start**
> Find signed-in tools and the clock on the local network, then keep the display running. **--device-url** sets the clock address. **--face** picks a face. **--only** limits the services to a comma-separated list. **--yes** accepts every signed-in account. **--no-browser** does not open the dashboard.

**demo**
> Render every clock face with sample data. **--out** is the output folder (default **token-tv-demo**). **--scale** writes an enlarged PNG (1 means none).

**setup**
> Write a config of emails and paths only. Refuses to overwrite an existing file. **--device-url** sets the clock. **--yes** does not prompt. **--isolate** keeps a separate login for TokenTV.

**doctor**
> Check that each configured CLI and login file is present. **--live** asks the provider and prints status only.

**add** _provider_
> Add another account of claude, codex, or grok. **--email** sets the address. **--no-login** only edits the config.

**connect**
> Sign an account in with that service's own CLI.

**run**
> Start the dashboard and drive the clock.

**autostart** on|off|status
> Start TokenTV when the computer starts, stop doing that, or print the current state.

**update**
> Put the newest release in place for the background copy.

**notify**
> Tell TokenTV that a turn finished, for a Codex notify hook.

# DESCRIPTION

**token-tv** drives a small Wi-Fi desk clock (a GeekMagic SmallTV or a compatible panel) from the usage limits of signed-in coding tools. It also renders the same faces to PNG files with **demo**, which needs no clock and no login. The program is a Python console script, installed with pip, or run without a permanent install as **npx token-tv** or **uvx token-tv**.

**start** is the usual path: it looks for the clock and for local logins, writes a config if you do not have one, and keeps updating the panel. **setup** writes that config by hand. The config holds emails and filesystem paths, not the tokens themselves. Those stay in each tool's own login file.

# CONFIGURATION

The config file is JSON. **--config** selects it. **setup** will not replace a file that already exists. Account homes can reuse the login directory of the official CLI, or a directory TokenTV keeps beside the config.

# CAVEATS

The clock must be on the same network as the computer that runs **token-tv**. A face name or service outside the lists the command accepts is rejected. **doctor --live** can cause a provider CLI to refresh an expired login.

# SEE ALSO

[claude](/man/claude)(1)

# RESOURCES

```[Source code](https://github.com/click6067-ship-it/token-tv)```

```[Homepage](https://click6067-ship-it.github.io/token-tv/)```

<!-- verified: 2026-11-26 -->
