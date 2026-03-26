# TAGLINE

Open files using mailcap MIME type entries

# TLDR

**View** a file using mailcap entry

```run-mailcap --action=view [path/to/file]```

**Edit** a file using mailcap entry

```run-mailcap --action=edit [path/to/file]```

**Print** a file using mailcap entry

```run-mailcap --action=print [path/to/file]```

**Cat** a file to stdout using copiousoutput rules

```run-mailcap --action=cat [path/to/file]```

Run with **debug** information

```run-mailcap --action=view --debug [path/to/file]```

**Display command** without executing

```run-mailcap --action=view --norun [path/to/file]```

# SYNOPSIS

**run-mailcap** [_--action=action_] [_--option[=value]_] [_MIME-TYPE:_[_ENCODING:_]]_FILE_ [...]

# PARAMETERS

**--action=**_action_
> Action to perform: view, cat, compose, composetyped, edit, print. The cat action uses only copiousoutput rules and sends output to stdout.

**--debug**
> Display diagnostic output for troubleshooting

**--nopager**
> Ignore copiousoutput directive and send output directly to stdout

**--norun**
> Display the command that would be executed without running it

# DESCRIPTION

**run-mailcap** executes programs via entries in the mailcap file based on MIME types. It selects appropriate handlers for viewing, editing, printing, or composing files.

The mailcap database maps MIME types to applications, enabling automatic file handling based on content type. The commands **see**, **edit**, **compose**, and **print** are aliases that default to the view, edit, compose, and print actions respectively.

# CAVEATS

Behavior depends on mailcap configuration. Some MIME types may not have configured handlers.

# HISTORY

Part of **mime-support** package, providing MIME type handling utilities based on RFC 1524 mailcap specification.

# SEE ALSO

[see](/man/see)(1), [edit](/man/edit)(1), [compose](/man/compose)(1), [print](/man/print)(1), [xdg-open](/man/xdg-open)(1), [file](/man/file)(1)
