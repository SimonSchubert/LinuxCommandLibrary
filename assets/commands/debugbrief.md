# TAGLINE

Turn a debugging session into an evidence-backed Markdown report

# TLDR

**Set up** debugbrief in the current project

```debugbrief init```

**Start** a new debugging session

```debugbrief start "[Login returns 500]"```

**Run a command** and record its output as evidence

```debugbrief run -- [pytest tests/test_login.py]```

**Add a note** during the session

```debugbrief note "[suspect the auth middleware]"```

**Re-run** the last captured command

```debugbrief redo```

**Finish** the session and generate the report

```debugbrief end --mode [pr]```

# SYNOPSIS

**debugbrief** _command_ [_arguments_]

# DESCRIPTION

**debugbrief** records what you do while debugging and turns it into an evidence-backed Markdown report suitable for a pull request, a handoff, or an incident note. Unlike AI summarizers, the report is built only from recorded evidence: the commands you ran, their output, the files that changed, and the notes you added.

A typical workflow is **init** once per project, then **start** to open a session, **run** to execute and capture commands, **note** to jot observations, and **end** to produce the report. The generated document includes a summary of test results and file changes, a red-to-green analysis with timing, a command timeline, error observations, and attempted fixes. Reports can be rendered in **pr**, **handoff**, or **incident** styles.

debugbrief is a Python tool, typically installed with **pipx install debugbrief** (also available via **uv tool install debugbrief** or **pip install debugbrief**).

# COMMANDS

**init**
> Configure the project and display the workflow.

**start**  _title_
> Begin a new debugging session with the given title.

**note**  _text_
> Record an observation in the active session.

**run** **--** _command_
> Execute a command and capture its output as evidence.

**redo**
> Re-execute the most recently captured command.

**end** [**--mode** _pr_|_handoff_|_incident_]
> Generate and save the report, then close the session.

**status**
> Show details of the active session.

**preview** [**--mode** _..._]
> Display the report without closing the session.

**cancel** [**--yes**]
> Abandon the active session.

**doctor** [**--fix**]
> Validate project health and optionally repair it.

**recover**
> Fix a broken session pointer.

**last**
> Locate the most recent report.

**open**
> Display the most recent report.

**list**
> Enumerate recorded sessions.

**show**  _id_
> Display a specific recorded session.

# CAVEATS

The report reflects only what was captured through debugbrief; commands run outside **debugbrief run** are not included as evidence. Because output is stored verbatim, review reports for secrets or sensitive data before sharing them.

# SEE ALSO

[script](/man/script)(1), [asciinema](/man/asciinema)(1), [git](/man/git)(1)

# RESOURCES

```[Source code](https://github.com/harihkk/Debug-Brief)```

<!-- verified: 2026-06-22 -->
