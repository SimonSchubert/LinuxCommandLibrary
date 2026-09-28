# TAGLINE

CLI and GUI administration client for Timekpr-nExT screen-time limits

# TLDR

**List** users known to Timekpr-nExT

```timekpra --getuserlist```

Show stored **limits and time** for a user

```timekpra --getuserinfo [username]```

Show the same info as **human-readable times** (hours and minutes)

```timekpra --getuserinfo [username] -h```

Show **live** time remaining for a logged-in user

```timekpra --getuserinfort [username]```

Allow **Monday to Friday** only

```timekpra --setalloweddays [username] '1;2;3;4;5'```

Set **daily limits** for those allowed days

```timekpra --settimelimits [username] '2h;2h;2h;2h;3h'```

**Add 30 minutes** to today's remaining time

```timekpra --settimeleft [username] + 30m```

Set the **lockout action** when time runs out

```timekpra --setlockouttype [username] terminate```

# SYNOPSIS

**timekpra**

**timekpra** **--help**

**timekpra** **--getuserlist**

**timekpra** {**--getuserinfo**|**--getuserinfort**} _user_ [**-h**]

**timekpra** **--setalloweddays** _user_ '_days_'

**timekpra** **--setallowedhours** _user_ {_day_|**ALL**} '_hours_'

**timekpra** **--settimelimits** _user_ '_limits_'

**timekpra** **--settimelimitweek** _user_ _limit_

**timekpra** **--settimelimitmonth** _user_ _limit_

**timekpra** **--settimeleft** _user_ {**+**|**-**|**=**} _amount_

**timekpra** **--setlockouttype** _user_ _type_

**timekpra** **--settrackinactive** _user_ {**true**|**false**}

**timekpra** **--sethidetrayicon** _user_ {**true**|**false**}

**timekpra** **--setplaytimeenabled** _user_ {**true**|**false**}

**timekpra** **--setplaytimeleft** _user_ {**+**|**-**|**=**} _amount_

# PARAMETERS

With no arguments and a graphical display, **timekpra** opens the Timekpr-nExT Control Panel. Without a display it prints a warning and falls through to CLI help.

**--getuserlist**, **--userlist**
> Print usernames Timekpr-nExT has configuration for.

**--getuserinfo**, **--userinfo** _user_ [**-h**]
> Print stored configuration and time counters. **-h** prints durations as time strings instead of seconds.

**--getuserinfort**, **--userinfort** _user_ [**-h**]
> Same layout as **--getuserinfo**, using live values from a logged-in session when available.

**--setalloweddays** _user_ '_d1;d2;..._'
> ISO 8601 weekdays the user may use the computer. Monday is **1**, Sunday is **7**. Example: **'1;2;3;4;5'**.

**--setallowedhours** _user_ {_day_|**ALL**} '_hours_'
> Hours (0-23) the user may be logged in on that day, or **ALL** days. Semicolon-separated. **7[00-30]** limits hour 7 to minutes 0-30. Prefix **!** for an unaccounted ("free") hour.

**--settimelimits** _user_ '_l1;l2;..._'
> Daily allowances for each allowed weekday, in order. Count must not exceed the allowed-day list. Values are seconds or time strings such as **2h**.

**--settimelimitweek** _user_ _limit_
> Weekly allowance (seconds or a time string such as **13h53m20s**).

**--settimelimitmonth** _user_ _limit_
> Monthly allowance (seconds or a time string such as **2d7h33m20s**).

**--settimeleft** _user_ {**+**|**-**|**=**} _amount_
> Add, subtract, or set remaining time for today. Does not bypass allowed hours or the daily/weekly/monthly caps.

**--setlockouttype** _user_ _type_
> Action when time runs out: **lock**, **suspend**, **suspendwake**, **terminate**, **kill**, **shutdown**. For **suspendwake**, pass **suspendwake;_from_;_to_** (wakeup hour range, default 0-23).

**--settrackinactive** _user_ {**true**|**false**}
> Count time while the session is locked or another user is active.

**--sethidetrayicon** _user_ {**true**|**false**}
> Hide the client tray icon and most notifications.

**--setplaytimeenabled** _user_ {**true**|**false**}
> Enable PlayTime (per-process limits) for this user. A separate master switch in the daemon config must also be on.

**--setplaytimelimitoverride** _user_ {**true**|**false**}
> Override mode: count computer time only while PlayTime activities are running.

**--setplaytimeunaccountedintervalsflag** _user_ {**true**|**false**}
> Whether PlayTime activities may run during unaccounted ("∞") hour intervals.

**--setplaytimealloweddays** _user_ '_days_'
> Weekdays PlayTime activities are allowed.

**--setplaytimelimits** _user_ '_limits_'
> Daily PlayTime allowances for those days.

**--setplaytimeactivities** _user_ '_mask[desc];..._'
> Process masks to track (executable name or regexp). Optional **[description]** is shown to the user.

**--setplaytimeleft** _user_ {**+**|**-**|**=**} _amount_
> Add, subtract, or set remaining PlayTime for today.

**--help**
> Print CLI usage. Also printed when the command line is invalid.

# DESCRIPTION

**timekpra** is the administration client for **Timekpr-nExT**, a Linux screen-time manager. A background daemon (**timekprd**) tracks logind sessions and enforces daily, weekly, and monthly allowances, allowed hours, and optional PlayTime process limits. **timekpra** talks to that daemon over D-Bus and applies changes immediately.

Run it as **root** (or with **sudo**), or as a member of the **timekpr** group. Group membership is needed for password-less GUI access; some advanced daemon options stay superuser-only. Adding a user to **timekpr** requires a new login before it takes effect.

Time values in CLI mode are seconds, or (since 0.5.9) compact time strings (**30m**, **2h**, **13h53m20s**, **2d7h33m20s**). Weekdays follow ISO 8601. The effective remaining time is the smallest of daily, weekly, monthly, and hour-interval rules.

With no CLI flags and **DISPLAY**, **WAYLAND_DISPLAY**, or **MIR_SOCKET** set, the GTK Control Panel starts instead of the CLI.

# CONFIGURATION

**/etc/timekpr/timekpr.conf**
> Daemon settings (poll interval, termination delay, PlayTime master switch).

**/var/lib/timekpr/config/timekpr.*.conf**
> Per-user limits. Prefer **timekpra** over editing these files.

**/var/lib/timekpr/work/timekpr.*.conf**
> Per-user runtime counters.

**$HOME/.config/timekpr/timekpr.conf**
> Client (end-user) preferences.

# CAVEATS

CLI configuration is user-level only; daemon-wide options are not exposed as flags. **--settimeleft** still respects allowed hours and period caps. PlayTime needs both the per-user flag and the daemon master switch. Session accounting depends on systemd-logind and desktop screensaver interfaces; some environments under-count idle or locked time. **shutdown** and **suspendwake** affect the whole machine.

# HISTORY

Timekpr-nExT is Eduards Bezverhijs's rewrite of the older **timekpr** / **timekpr-revived** parental-control tools, with D-Bus integration and a first-class CLI. Version **0.5.10** is current in the Launchpad tree.

# INSTALL

```apt: sudo apt install timekpr-next```

```aur: yay -S timekpr-next```

```zypper: sudo zypper install timekpr-next```

<!-- packages: 2026-09-28 -->

# SEE ALSO

[loginctl](/man/loginctl)(1)

# RESOURCES

```[Source code](https://git.launchpad.net/timekpr-next)```

```[Homepage](https://mjasnik.gitlab.io/timekpr-next/)```

<!-- verified: 2026-09-28 -->
