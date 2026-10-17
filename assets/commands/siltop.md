# TAGLINE

Apple Silicon system monitor for the terminal

# TLDR

**Open** the live dashboard

```siltop```

Play a **canned session** without sampling this Mac

```siltop --demo```

Sample **every second** on the Paper theme

```siltop -i [1s] --theme [paper]```

Start on the compact **Glance** surface

```siltop --surface [glance] --no-mouse```

Print **one JSON sample**

```siltop --json```

Stream **NDJSON** for a minute

```siltop --json-stream -i [1s] --count [60]```

Print the one-line **verdict** and the evidence behind it

```siltop --diagnose```

Show what this Mac **exposes** to a normal user

```siltop doctor```

One **status line** for tmux or SketchyBar

```siltop line --style [tmux]```

**Energy and heat** over the last week, as JSON

```siltop report week --json```

Watch **this Mac beside others** over your own ssh

```siltop fleet [studio.local] [mini.local]```

# SYNOPSIS

**siltop** [_options_]

**siltop** _command_ [_arguments_]

# DESCRIPTION

**siltop** is a terminal system monitor for Apple Silicon Macs (M1 through M5). It shows CPU (per cluster and per core), GPU, memory and pressure, power, temperatures, fans, network, disk, and processes. A reading the Mac does not publish is left out or shown as **—**, never as a made-up zero. Fanless machines have no fan panel, and desktops have no battery.

The default **Work** surface is graphs beside a process table. **Glance** is graphs only, for a small window. CPU usage on the main graph is frequency-weighted: a core that is busy at half its top clock counts as half busy, so the figure can read lower than Activity Monitor. Power rails that publish in batches are held and marked **≈** with their age instead of dropping to zero.

With no command, **siltop** opens the dashboard. Headless modes print JSON, a verdict, a status line, or Prometheus metrics and do not need a full-screen UI. The background **agent** runs the same alerts at login without a dashboard. History is kept for 30 days and can be reported or exported after the dashboard is closed.

Numbers come from macOS APIs a normal user may call: the SMC for fans, temperatures, and system power; IOReport for clocks and energy; IOHID for sensors; Mach and sysctl for CPU, memory, and processes. It does not call **ps** or **powermetrics**, and it does not require sudo.

# PARAMETERS

**-i**, **--interval** _TIME_

> Sampling interval, from 100 ms to 60 s. A bare number or a **ms** suffix is milliseconds (**250**, **250ms**). A **s** suffix is seconds (**1s**, **1.5s**).

**--theme** _NAME_

> Colour theme. **auto** (the default) builds one from the terminal palette. Built-ins include **billabong**, **paper**, **okabe**, **terminal**, **catppuccin-mocha**, **tokyo-night**, **nord**, **kanagawa**, and **gruvbox-dark**. **siltop theme list** prints the full set.

**--surface** _NAME_

> Start on **work** or **glance**.

**--no-mouse**

> Do not capture the mouse.

**--config** _PATH_

> Read preferences from _PATH_ instead of the default config file.

**--demo**

> Play a canned 60-second session instead of sampling this Mac. Also accepted by scripting modes, **bench**, and **fleet**, so a script can be tried without hardware.

**--json**

> Print one JSON sample and exit. Unmeasured values are **null**, not **0**. With **report** or **bench**, print that report as one JSON object instead.

**--json-stream**

> Print one JSON sample per interval as NDJSON.

**--count** _N_

> Stop **--json-stream** after _N_ samples.

**--procs** _N_

> How many processes to include in JSON output. Default is 10.

**--diagnose**

> Print the verdict (**All normal**, **Busy: …**, **Hot: …**) and the evidence behind it.

**--print-config**

> Print the effective preferences, after **-i**, **--surface**, and **--theme**, and exit.

**-h**, **--help**

> Print help. **siltop help** _COMMAND_, or _COMMAND_ **--help**, prints one command.

**-V**, **--version**

> Print the version. **--verbose** adds the build and the config and state paths. **--json** prints the same facts as JSON.

# COMMANDS

**doctor**

> Print the model, chip, SMC keys, temperature sensors, which readings work without root, and what siltop itself costs. Useful in a bug report.

**theme list**

> List every built-in, pack, and user theme.

**theme import** _FILE_

> Convert a btop **.theme** file into **themes/** next to the config.

**report today** | **week** | **month**

> Energy by app, peak power and temperatures, and time spent hot, from saved history. **week** is 7 days and **month** is 30. **--json** prints one JSON object. Works with the dashboard closed.

**agent status** | **install** | **uninstall** | **run**

> Alerts in the background as a per-user LaunchAgent (no sudo). **install** starts it at login. **run** is the foreground mode launchd uses. The default action is **status**.

**line** [**--format** _TEMPLATE_] [**--style** _STYLE_]

> Print one status line and exit, for tmux, SketchyBar, or Starship. The template may use **{cpu}**, **{gpu}**, **{mem}**, **{power}**, **{temp}**, **{swap}**, **{thermal}**, **{verdict}**, and **{alerts}**. A reading this Mac cannot measure is omitted. **--style** is **plain**, **ansi**, or **tmux**.

**record** [**--out** _FILE_] [**--duration** _SPAN_]

> Record this Mac to a **.ptrace** file (default **siltop-<time>.ptrace**) until _SPAN_ (**90s**, **10m**, **2h**) elapses or Ctrl-C. A cut-short file still replays up to its last whole frame.

**replay** _FILE_

> Play a **.ptrace** in the dashboard. **p** pauses, **+** and **-** change speed, and the arrow keys scrub.

**bench** [**--duration** _SPAN_] [**--light**] [**--json**]

> Sustained CPU test. Spins one busy thread per logical core (half the cores with **--light**), then reports early versus sustained clocks, peak temperature, and whether the chip throttled. Default duration is 60 s. A run that is stopped early is **incomplete** unless throttling was already seen. Compared with the last full run of the same kind on the same chip. Stops if any temperature reaches 105 °C.

**serve** [**--addr** _HOST:PORT_]

> Serve Prometheus metrics. **GET /metrics** only. Listens on **127.0.0.1:9101** unless **--addr** names another address.

**fleet** _HOST_ ...

> This Mac beside other Macs, one card per host. Each remote is **ssh -o BatchMode=yes --** _HOST_ **siltop --json-stream --procs 3**, so the remote needs siltop on **PATH** and key-based login. **--demo** fills the grid without ssh.

**export --csv** [**--from** _WHEN_] [**--to** _WHEN_]

> Print saved history as CSV. _WHEN_ is a UTC date (**2026-09-23**) or a span ago (**24h**, **7d**). **--csv** is required.

**onboarding**

> Show the first-run screens again.

**update** [**--check** | **--yes** | **--rollback**]

> Look up a newer GitHub release and say how to install it. A Homebrew or **cargo install** copy is not replaced in place. **--yes** installs a release download you can write. **--check** exits 10 when an update exists. **--rollback** restores **siltop.old**.

**feedback** [**--bug**] [**--copy**]

> Print a prefilled GitHub issue link (version, chip, macOS build, install method). **--bug** uses the bug-report form. **--copy** puts **siltop doctor** output on the clipboard and does not open a browser.

**reset** [**--yes**]

> Delete config, state, and history. **--yes** skips the typed confirmation.

**completions** _SHELL_

> Print a completion script for **zsh**, **bash**, or **fish**.

**man**

> Print the manual page in roff. **siltop man | mandoc -a** displays it.

# KEYS

**q**

> Quit. Inside an overlay, **q** closes the overlay instead.

**m**

> Main menu.

**?**

> Searchable list of every key.

**s**

> Settings. Changes are written back to the config file and existing comments are kept.

**v**

> Switch between Work and Glance.

**T**

> Next theme.

**e**

> Expand or collapse the focused panel.

**p**

> Pause. Sampling stops as well.

**[** and **]**

> Sample slower or faster.

**1** through **5**

> Presets: silicon, ml, laptop, sre, and ricer. They change which panels show and how the process table sorts.

**H**

> Timeline of saved history on one time axis.

**Z**

> Zen mode: graphs only.

**/**

> Filter the process table. **t** toggles the tree, **a** groups helpers under their app, **x** sends SIGTERM, **K** sends SIGKILL, and **X** opens the signal picker. A kill is refused if the pid was reused.

**SILTOP_KEYS=htop** or **SILTOP_KEYS=btop** starts in that key profile.

# CONFIGURATION

Preferences live in **$XDG_CONFIG_HOME/siltop/config.toml** (default **~/.config/siltop/config.toml**). The file is written only when a setting changes. User themes are **.toml** files in **themes/** beside it.

State lives in **$XDG_STATE_HOME/siltop/** (default **~/.local/state/siltop/**): **history/** (up to 30 days), **bench.ndjson**, **updates.toml**, **agent.json** and **agent.log** when the agent runs, and **crash-<time>.txt** if the process panics. **agent install** adds **~/Library/LaunchAgents/com.siltop.agent.plist** and **uninstall** removes it.

**SILTOP_THEME**

> Theme name. Overrides the config file.

**SILTOP_KEYS**

> **siltop**, **htop**, or **btop**.

**SILTOP_COLORS**

> **truecolor**, **256**, **16**, or **none**.

**SILTOP_ICONS**

> **unicode**, **nerd**, or **none**.

**SILTOP_GLASS**

> Translucent window: **on**, **off**, **auto**, or an opacity such as **0.8**.

**SILTOP_NO_ONBOARDING**

> Skip the first-run screens.

**SILTOP_NO_UPDATE_CHECK**

> Any value other than **0** or **false** turns update checks off.

**NO_COLOR**

> Any non-empty value: attributes only, unless a theme is named. **line --style ansi** then prints plain text.

The disk panel is off until **disk = true** under **[panels]**.

# CAVEATS

Apple Silicon macOS only. Intel Macs and Linux can compile the binary, but the collectors are stubs and sample nothing.

macOS hides CPU, memory, and energy for other users' processes. Those rows keep their name and pid and show **—** for the rest. Their CPU is still counted in the machine total. Run with sudo only if those per-process numbers are required.

The dashboard needs a terminal. A pipe or cron job should use **--json**, **--json-stream**, or **--diagnose**.

A browser-downloaded binary is quarantined because the release is not notarized. Clear it with **xattr -d com.apple.quarantine siltop**, or install with curl or Homebrew, which are not quarantined. Graphs use Braille; the font needs those characters (SF Mono, Menlo, JetBrains Mono, Iosevka, and Nerd Fonts do).

Update checks, when opted in, run **/usr/bin/curl** at most once a day against the GitHub releases API and send only **siltop/**_version_ as the User-Agent. **serve** is the only listener, on loopback unless **--addr** says otherwise. **fleet** reaches other Macs only through ssh.

Exit status **0** is success, **1** is a runtime error, **2** is a usage error or a dashboard with no terminal, and **10** means **update --check** found a newer release.

# HISTORY

**siltop** is written in Rust by **Lay Sheth** (2026). It is licensed under MIT or Apache-2.0, at your option.

# SEE ALSO

[btop](/man/btop)(1), [htop](/man/htop)(1), [macmon](/man/macmon)(1), [top](/man/top)(1), [nvtop](/man/nvtop)(1)

# RESOURCES

```[Source code](https://github.com/CLoaKY233/siltop)```

```[Documentation](https://github.com/CLoaKY233/siltop/blob/master/docs/guide.md)```

<!-- verified: 2026-10-17 -->
