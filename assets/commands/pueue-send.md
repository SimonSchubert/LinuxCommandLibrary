# TAGLINE

Send stdin input to running pueue tasks

# TLDR

**Send input to a running task**

```pueue send [task_id] "[input]"```

**Send a yes response to a prompt**

```pueue send [task_id] "yes"```

**Send a newline (empty line)**

```pueue send [task_id] ""```

**Send escaped sequences (interpret backslash escapes)**

```pueue send -e [task_id] "line1\nline2"```

# SYNOPSIS

**pueue send** [_-e_] _task_id_ _input_

# PARAMETERS

_TASK_ID_
> Numeric ID of the running task to receive input.

_INPUT_
> String written to the task's stdin. A newline is appended automatically.

**-e**, **--escape**
> Interpret backslash escapes such as `\n`, `\t`, `\\`.

# DESCRIPTION

**pueue send** writes text to the standard input of a running task in the **pueue** queue, enabling interaction with commands that prompt for user input. This is useful for confirming prompts, supplying passphrases, or feeding data to long-running tasks that the daemon supervises.

The target task must have been started with stdin attached (the default for **pueue add**) and must currently be in the running state.

# CAVEATS

The task must be running; queued, paused, or finished tasks cannot receive input. Each invocation appends a newline. Sensitive input (passwords, tokens) is visible in shell history and process arguments.

# HISTORY

**pueue** is a command-line task queue manager written in Rust by **Arne Beer**. The **send** subcommand was added to allow non-interactive queues to handle programs that occasionally require stdin.

# INSTALL

```pacman: sudo pacman -S pueue```

```apk: sudo apk add pueue```

```zypper: sudo zypper install pueue```

```brew: brew install pueue```

```nix: nix profile install nixpkgs#pueue```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[pueue](/man/pueue)(1), [pueue-add](/man/pueue-add)(1), [pueue-follow](/man/pueue-follow)(1), [pueue-log](/man/pueue-log)(1), [pueue-status](/man/pueue-status)(1)

