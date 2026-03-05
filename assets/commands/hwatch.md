# TAGLINE

Modern alternative to the watch command with diff history

# TLDR

**Watch a command** every 2 seconds

```hwatch [command]```

**Watch with a custom interval**

```hwatch -n [5] [command]```

**Watch with color output**

```hwatch -c [command]```

**Watch and highlight differences**

```hwatch -d [command]```

**Execute action on output change**

```hwatch -A "[action_command]" [command]```

**Output diffs to stdout** instead of TUI

```hwatch -b [command]```

# SYNOPSIS

**hwatch** [**-n** _interval_] [**-c**] [**-d**] [**-A** _command_] [**-b**] _command_

# DESCRIPTION

**hwatch** is a modern alternative to the **watch** command that records the differences in execution results and allows you to review this history afterward. It provides a TUI with the ability to scroll through previous outputs, search and filter history, and highlight differences between runs.

Key features include color mode support, regex filtering of history with **/** and **\*** keys, change detection with the **-A** option (which stores change information as JSON in the **HWATCH_DATA** environment variable), and the ability to output diffs directly to stdout with **-b** instead of using the TUI.

# CAVEATS

History is stored in memory and does not persist across restarts. Very frequent intervals with large outputs may consume significant memory.

# HISTORY

**hwatch** was created by **blacknon** and is written in **Rust**. It was designed to address limitations of the traditional watch command, particularly the inability to review or compare previous outputs.

# SEE ALSO

[watch](/man/watch)(1)
