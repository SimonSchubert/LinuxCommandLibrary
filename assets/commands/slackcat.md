# TAGLINE

Pipe command output to Slack channels

# TLDR

**Send message**

```slackcat -c [channel] -m "[message]"```

**Pipe to channel**

```cat [file] | slackcat -c [channel]```

**Upload file**

```slackcat -c [channel] [file.txt]```

**Send as snippet**

```slackcat -c [channel] --filename [code.py] [file.py]```

**Tee mode**

```cat [file] | slackcat -c [channel] --tee```

**Stream output**

```tail -f [log] | slackcat -c [channel] --stream```

# SYNOPSIS

**slackcat** [_-c channel_] [_-m message_] [_options_] [_file_]

# PARAMETERS

**-c** _CHANNEL_
> Target channel.

**-m** _TEXT_
> Message text.

**--filename** _NAME_
> Upload filename.

**--tee**
> Also print to stdout.

**--stream**
> Stream mode.

**--noop**
> Dry run.

# DESCRIPTION

**slackcat** pipes command-line output and files directly to Slack channels, bridging terminal workflows with team communication. It accepts input from stdin, command arguments, or file uploads, sending the content as messages or file snippets to a specified channel.

Stream mode (**--stream**) sends output continuously as it arrives, useful for tailing log files into Slack in real time. Tee mode (**--tee**) simultaneously prints output to stdout and sends it to Slack, preserving normal terminal behavior while sharing with the team.

# CAVEATS

Requires Slack token. API configuration needed. Rate limits apply.

# HISTORY

**slackcat** was created to pipe command-line output directly to Slack channels for team communication.

# SEE ALSO

[slack](/man/slack)(1), [curl](/man/curl)(1), [tee](/man/tee)(1)
