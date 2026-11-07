# TAGLINE

Read phone data and trigger Android actions from Omalauncher's Linux system

# TLDR

Show the phone's **approximate location**

```omalauncher location```

List **calendar events** for the next 7 days

```omalauncher calendar 7```

Show **battery** level, charging state and health

```omalauncher battery```

Show the connected **AirPods** status

```omalauncher airpods```

Switch the AirPods to **noise cancellation**

```omalauncher airpods anc```

Post a **notification** on the phone

```omalauncher notify "[build done]" "[all tests passed]"```

Open Android's **share sheet** for a file

```omalauncher share [report.pdf]```

Show the launcher **version** and available commands

```omalauncher version```

# SYNOPSIS

**omalauncher** _command_ [_arguments_]

**omalauncher** **location** | **battery** | **version**

**omalauncher** **calendar** [_days_]

**omalauncher** **airpods** [_control_ [_value_]]

**omalauncher** **notify** _title_ [_text_]

**omalauncher** **share** _file_...

# PARAMETERS

**location**
> Print the approximate position as `{lat, lon, accuracy, time}`, with accuracy in metres.

**calendar** [_days_]
> Print the events still to come from today on, for _days_ days (default **14**): `[{id, eventId, title, start, end, allDay, calendar, color, location}]`.

**airpods**
> Print the connected AirPods' batteries, listening mode and settings.

**airpods** _control_ [_value_]
> Change a mode or setting. Modes: `off`, `anc`, `transparency`, `adaptive`, `next`. Toggles: `conversation`, `oneBud`, `earDetection` [`on`|`off`]. Level: `adaptiveLevel` _0-100_.

**battery**
> Print `{level, charging, status, plugged, saver, temp, voltage, health, technology, cycles}`.

**notify** _title_ [_text_]
> Show a notification on the phone; tapping it opens the home screen. Prints nothing.

**share** _file_...
> Open Android's share sheet for the files so the user can pick an app. Relative paths are resolved against the current directory. Prints nothing.

**version**, **--version**
> Print `{version, versionCode, commands}`.

**-h**, **--help**, **help**
> Print usage and exit.

**--**
> End of options: put it before a title, text or file that starts with `-`.

# DESCRIPTION

**omalauncher** is the bridge between the Arch Linux ARM system that **Omalauncher** (an Android home screen with the look of Omarchy) runs under proot and the phone itself. Scripts and coding agents inside Linux use it to read the phone's location, calendar, battery and AirPods, and to post notifications or share files through Android.

It prints JSON and only uses what the launcher was already allowed: it never asks for a permission itself. Each call drops a request into the launcher's inbox (`/run/user/0/phone`) and waits for the answer. Times are Unix seconds.

Exit codes: **0** success, **1** nothing to say (no location fix yet, no AirPods connected, Bluetooth off), **2** wrong arguments, **3** the launcher isn't allowed it (grant it from a widget or Android's app settings), **4** the launcher isn't running or didn't answer.

# CAVEATS

Only works inside Omalauncher's Linux system, with the launcher running. A request that is not picked up within 5 seconds, or not answered within 2 minutes, exits with **4**.

No command takes options yet; any word starting with `-` is refused unless it comes after **--** (`omalauncher notify -- "-5 degrees out"`).

Before version 0.20 the command was called **phone**, which still works as an alias.

# SEE ALSO

[omarchy](/man/omarchy)(1), [notify-send](/man/notify-send)(1), [jq](/man/jq)(1)

# RESOURCES

```[Source code](https://github.com/SimonSchubert/omalauncher)```

```[Documentation](https://github.com/SimonSchubert/omalauncher#the-omalauncher-command)```

<!-- verified: 2026-11-07 -->
