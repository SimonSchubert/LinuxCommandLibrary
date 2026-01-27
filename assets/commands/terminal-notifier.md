# TLDR

**Send a basic notification**

```terminal-notifier -message "[Task completed]"```

**Send with title and subtitle**

```terminal-notifier -title "[Build]" -subtitle "[Success]" -message "[All tests passed]"```

**Send with a sound**

```terminal-notifier -message "[Done]" -sound default```

**Send and open URL on click**

```terminal-notifier -message "[New issue]" -open "[https://github.com]"```

**Send and activate an app on click**

```terminal-notifier -message "[Sync complete]" -activate [com.apple.AddressBook]```

**Send from piped input**

```echo "[Build finished]" | terminal-notifier```

**Group notifications** (replace previous)

```terminal-notifier -group "[build]" -message "[Completed]"```

# SYNOPSIS

**terminal-notifier** [_-title title_] [_-subtitle subtitle_] [_-message message_] [_-sound name_] [_-group id_] [_-activate bundleid_] [_-open url_]

# PARAMETERS

**-message** _text_
> The notification message body (required unless piping)

**-title** _text_
> The notification title (default: "Terminal")

**-subtitle** _text_
> The notification subtitle

**-sound** _name_
> Play a sound from /System/Library/Sounds; use "default" for system default

**-group** _id_
> Group identifier; only one notification per group shown at a time

**-activate** _bundleid_
> Activate specified app when notification is clicked

**-open** _url_
> Open URL when notification is clicked

**-remove** _id_
> Remove notification with specified group ID

**-list** _id_
> List notifications with specified group ID

# DESCRIPTION

**terminal-notifier** sends macOS User Notifications from the command line. It enables scripts and terminal commands to display native system notifications with customizable content, sounds, and click actions.

Notifications can include titles, subtitles, message bodies, and sounds. Click actions can open URLs, activate applications, or execute callbacks. Group identifiers allow replacing previous notifications instead of stacking them.

The tool is useful for alerting when long-running processes complete, such as builds, downloads, or scheduled tasks.

# CAVEATS

Sticky notifications (alerts) require manual configuration in System Settings > Notifications > terminal-notifier. Action buttons are not supported; use **alerter** for that functionality. Requires macOS 10.10 or higher.

# HISTORY

terminal-notifier was created by **Eloy Durán** (julienXX) as an open-source tool to bring macOS notifications to command-line workflows. It became popular for integrating native notifications into development toolchains.

# SEE ALSO

[osascript](/man/osascript)(1), [notify-send](/man/notify-send)(1)
