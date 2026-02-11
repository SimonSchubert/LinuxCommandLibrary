# TAGLINE

Open files using mailcap MIME type entries

# TLDR

**View** a file using mailcap entry

```run-mailcap --action=view path/to/file```

**Edit** a file using mailcap entry

```run-mailcap --action=edit path/to/file```

Run with **debug** information

```run-mailcap --action=view --debug path/to/file```

Forward output to **stdout** without pager

```run-mailcap --action=view --nopager path/to/file```

**Display command** without executing

```run-mailcap --action=view --norun path/to/file```

# SYNOPSIS

**run-mailcap** [_options_] _file_

# PARAMETERS

**--action** _action_
> Action to perform (view, cat, compose, composetyped, edit, print)

**--debug**
> Show extra information

**--nopager**
> Forward output to stdout, ignore copiousoutput

**--norun**
> Display command without executing

# DESCRIPTION

**run-mailcap** executes programs via entries in the mailcap file based on MIME types. It selects appropriate handlers for viewing, editing, printing, or composing files.

The mailcap database maps MIME types to applications, enabling automatic file handling based on content type.

# CAVEATS

Behavior depends on mailcap configuration. Some MIME types may not have configured handlers.

# HISTORY

Part of **mime-support** package, providing MIME type handling utilities based on RFC 1524 mailcap specification.

# SEE ALSO

[see](/man/see)(1), [edit](/man/edit)(1), [print](/man/print)(1), [file](/man/file)(1)
