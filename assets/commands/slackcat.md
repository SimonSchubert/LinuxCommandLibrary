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

**slackcat** sends to Slack. It pipes output to channels.

Command output to Slack. Integrate with scripts.

File uploads supported. Share snippets.

Stream mode available. Continuous output.

Tee mode preserves output. Send and display.

# CAVEATS

Requires Slack token. API configuration needed. Rate limits apply.

# HISTORY

**slackcat** was created to pipe command-line output directly to Slack channels for team communication.

# SEE ALSO

[slack](/man/slack)(1), [curl](/man/curl)(1), [tee](/man/tee)(1)
