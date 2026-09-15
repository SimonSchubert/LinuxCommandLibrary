# TAGLINE

read-only Linux health checks that explain what is wrong and how to fix it

# TLDR

Run **all applicable checks** and print the report

```linux-doctor```

Run **only memory and disk** checks

```linux-doctor --check memory,disk```

**List** available checks without running them

```linux-doctor --list```

Print a **one-line summary** (score and severity counts)

```linux-doctor --summary```

Machine-readable **JSON** report

```linux-doctor --json```

Plain, **tab-separated** output (no colors or emoji)

```linux-doctor --plain```

Show a **dry-run** of safe-fix commands

```linux-doctor --fix```

Apply catalog **[apply]** fixes after reviewing the plan

```linux-doctor --fix --yes```

Browse findings in an **interactive** terminal UI

```linux-doctor --interactive```

Open the **web dashboard** on loopback

```linux-doctor --web```

Save a **share-ready Markdown** report (IPs and home paths redacted)

```linux-doctor --md [report.md]```

Install a **daily user systemd timer** with desktop notifications

```linux-doctor --install-timer```

Guided **first-run** setup (config, timer, notification test)

```linux-doctor --init```

# SYNOPSIS

**linux-doctor** [_options_]

# PARAMETERS

**--check** _id_
> Run only the given check(s). Repeat the flag or pass a comma-separated list.

**--list**
> List available checks by category without running them.

**--check-list**
> List checks as JSON (id, title, category, appliesTo).

**--json**
> Machine-readable JSON output (schema version 1).

**--plain**
> Plain, tab-separated text with no colors or emoji. Metadata is `#` comment lines.

**--summary**
> One-liner with score, severity counts, and delta versus the previous run.

**--md** _path_
> Write a Markdown report. IPs, home paths, and UIDs are redacted.

**--html** _path_
> Write a standalone HTML report.

**--todo**
> Numbered, copy-pasteable list of fix steps in priority order.

**--fix**
> Dry run: print safe-fix commands from the built-in catalog. Nothing is executed.

**--fix --yes**
> Execute catalog **[apply]** commands. **[manual]** items are printed, never run.

**--interactive**
> Interactive terminal UI over the report. Needs a TTY; otherwise prints the normal report.

**--notify**
> Send a desktop notification (`notify-send`) when new medium or high findings appear.

**--web**
> Open the visual dashboard in a browser on 127.0.0.1.

**--self-test**
> Explain the environment: distro, profile, which checks run, and why others are skipped.

**--init**
> Guided first-run setup: starter config, daily timer, and a notification test.

**--init-config**
> Create a starter config file with commented thresholds.

**--install-timer**
> Install a user-level systemd timer (no sudo) that runs daily with **--notify**.

**--uninstall-timer**
> Remove and disable the timer installed by **--install-timer**.

**--no-history**
> Do not read or write run history for this run.

**--history-clear**
> Clear stored run history.

**--compare** _file_
> Diff a previous JSON report against the current run.

**--severity** _level_
> Show only findings at this severity: **high**, **medium**, or **info**.

**--ignore** _text_
> Hide findings whose title contains _text_ (this run only).

**--ignore-code** _code_
> Hide findings by stable code (for example `services/failed`).

**--ignore-add** _value_
> Persistently ignore a code or title fragment (saved to config).

**--ignore-remove** _value_
> Remove a previously ignored code or title fragment.

**--ignore-list**
> Show configured ignore patterns and exit.

**--support**
> Write a privacy-scrubbed support bundle for bug reports.

**--schema**
> Print the JSON Schema for **--json** output and exit.

**--profile**
> Append per-check durations to the report.

**--debug**
> Trace every spawned command and its result to stderr.

**--ai**
> Add an AI summary in plain English (needs **LLM_API_KEY**). Finding text is scrubbed first.

**--ai-local**
> Same as **--ai**, but use a local Ollama model (no cloud).

**--push** _url_
> Post the report to a fleet server (**FLEET_API_KEY** optional).

**--allow-private-endpoint**
> Allow **--push**, **--alert**, **--heartbeat**, and **--ai** to target private or LAN addresses.

**--alert** _url_
> POST a webhook when the machine degrades (Pro).

**--heartbeat** _url_
> Ping a dead-man's switch after every run (Pro).

**--daemon**
> Run continuously, re-checking every **--interval** (Pro).

**--interval** _seconds_
> Seconds between **--daemon** runs (default 3600). Pro.

**--license**
> Show Pro add-on status and exit.

**-h**, **--help**
> Show usage.

**--version**
> Show the version number.

# DESCRIPTION

**linux-doctor** runs read-only health checks on a Linux system, surfaces issues that actually matter, and explains each finding in plain language with a suggested fix. It is a diagnostic, not a monitor: it answers "what is wrong right now?" instead of streaming metrics.

A full report leads with a **START HERE** next action, a health score from 0 to 100, a trend sparkline of recent runs, and a NEW/FIXED/unchanged diff against the previous run. Findings carry a stable `code` (`check/reason`), a severity, evidence from the system, and a copy-paste fix.

Checks cover memory and swap pressure, load, disk and inode usage, filesystem errors, software RAID, OOM kills, failed systemd units, TLS certificate expiry, exposed ports, journal errors, containers, crash and reboot history, firewall and SSH posture, network and DNS, time sync, package and firmware updates, SMART health, GPU and thermal state, backups, and more. Checks that do not apply (battery on a desktop, reboot on an immutable image) are skipped and listed honestly.

The CLI never modifies the system unless **--fix --yes** is given. **--fix** alone prints a dry-run plan from a small built-in catalog mapped to finding codes; free-text suggestions in the report are never executed. The same check engine also powers **--web** and an optional Tauri desktop app.

# EXIT CODES

**0**
> No high or medium severity findings.

**1**
> At least one high or medium severity finding.

**2**
> Usage or runtime error (bad flags, unknown check, and similar).

# FILES

**~/.config/linux-doctor/config.json**
> Ignore patterns and threshold overrides. Override path with **LINUX_DOCTOR_CONFIG**.

**~/.config/linux-doctor/checks/**
> Drop-in plugin checks (`.js` files). Override with **LINUX_DOCTOR_PLUGINS**.

**~/.local/share/linux-doctor/history.json**
> Run history used for the health-score trend and NEW/FIXED diffs. Override with **LINUX_DOCTOR_HISTORY**.

**~/.cache/linux-doctor/updates.json**
> Cache for the package-updates check (about 30 minutes). Override with **LINUX_DOCTOR_CACHE**.

# CONFIGURATION

**~/.config/linux-doctor/config.json** holds optional **ignore** / **ignoreCodes** lists and a **thresholds** object. Every threshold key is optional; unset keys keep desktop defaults (disk 90/80 percent, memory available ratio 0.15/0.25, load per core, CPU temperature, journal size, container storage, DNS latency, certificate lifetime, backup staleness, and others).

```linux-doctor --init-config```
> Write a starter file with commented thresholds.

```linux-doctor --ignore-add [services/failed]```
> Persistently hide a finding by code or title fragment.

```linux-doctor --thresholds-json```
> Print current thresholds and defaults.

Drop any trusted `.js` file that exports `{ id, run }` into **~/.config/linux-doctor/checks/** to add a check. Plugins run with the user's full privileges; Linux Doctor does not sandbox them.

# ENVIRONMENT

**LINUX_DOCTOR_CONFIG**
> Path to the configuration file.

**LINUX_DOCTOR_HISTORY**
> Path to the history file.

**LINUX_DOCTOR_PLUGINS**
> Directory of plugin checks.

**LINUX_DOCTOR_CACHE**
> Directory for the updates cache.

**LINUX_DOCTOR_NO_HISTORY**
> When set, do not read or write history (same as **--no-history**).

**LINUX_DOCTOR_DEBUG**
> When set to **1**, trace spawned commands to stderr (same as **--debug**).

**LINUX_DOCTOR_NODE**
> Path to a Node.js interpreter (desktop packages bundle their own).

**LLM_API_KEY**
> API key for **--ai** cloud summaries.

**FLEET_API_KEY**
> Optional bearer token for **--push**.

# CAVEATS

The npm CLI needs **Node.js 20** or newer. Packaged `.deb`, `.rpm`, and AppImage builds of the desktop app embed a Node runtime so nothing extra is required on PATH.

Checks are read-only. **--fix --yes** only runs catalog **[apply]** entries; enabling a firewall, package autoremove, container prune, and trash deletion stay **[manual]**. Review the dry-run plan first.

SMART and some security probes need root or extra tools (`smartctl`). Without them the check is skipped rather than reported as healthy. Immutable/atomic distros skip checks that cannot be acted on locally (notably **reboot**).

**--ai** and fleet **--push** send scrubbed finding text off-box. Private or LAN destinations are refused unless **--allow-private-endpoint** is passed. **--web** binds to loopback.

Exit status **1** means findings exist, not that the tool failed. Use **2** for errors in scripts.

# HISTORY

**Linux Doctor** is a Node.js diagnostics CLI by **zShaD0w7x**, first released in **August 2026** (GPL-3.0-or-later, with an optional commercial/Pro add-on). Version **0.6.0** (**2026-09-13**) added a bundled Node runtime in the desktop packages, auto-update for the AppImage, **--debug** command tracing, and **--allow-private-endpoint**.

# SEE ALSO

[inxi](/man/inxi)(1), [journalctl](/man/journalctl)(1), [systemctl](/man/systemctl)(1), [smartctl](/man/smartctl)(8), [df](/man/df)(1), [free](/man/free)(1), [glances](/man/glances)(1)

# RESOURCES

```[Source code](https://github.com/zShaD0w7x/linux-doctor)```

```[Documentation](https://github.com/zShaD0w7x/linux-doctor/blob/main/docs/cli.md)```

<!-- verified: 2026-09-16 -->
