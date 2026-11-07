# TAGLINE

Review and guard what a coding agent did on this machine

# TLDR

Print a **card** of recent agent activity

```stroq```

Install hooks so the **next** session is guarded

```stroq init```

Explain why an action was **stopped**

```stroq why```

Replay 36 known attacks in a **sandbox**

```stroq attack```

Show the evidence behind one card line

```stroq show [1]```

Open the local **console**

```stroq console```

Judge the last 30 days of sessions against today's policy

```stroq replay --all```

See whether an agent **moved a key** (names only, never values)

```stroq sent```

Remove Stroq

```stroq uninstall```

List the rest of the commands

```stroq help --all```

# SYNOPSIS

**stroq** [_command_] [_options_]

# PARAMETERS

(no command)

> Print the card: counts for recent agent activity and lines you can open with **show**

**init**

> Hook the local coding agent so later actions are checked

**why**

> Explain a stop

**attack**

> Run the published attack set in a throwaway home and report how the current policy treats each one

**show** _n_

> Print the evidence for card item _n_

**console** [**--workspace** _dir_]

> Serve a private page on 127.0.0.1 for the current machine, or for **--workspace**

**replay** [**--all**]

> Read agent transcripts and score them with the current policy. **--all** covers every session from the last 30 days. Nothing is executed and nothing is uploaded

**sent**

> Compare Claude Code, Codex CLI, and Cursor sessions with credentials on the machine. Output names the key and where it went. It does not print secret values

**uninstall**

> Remove the hooks and the local install

**help --all**

> List commands that the short help omits

# DESCRIPTION

**stroq** is the command from the npm package `@stroq/cli`. `npx @stroq/cli` runs the same binary. It needs Node.js 22 or newer. The default invocation prints a card of what local coding agents ran, what they read, and which of those moments are worth opening. Each moment has a **show** line.

**init** connects those agents so the next session is checked before an action runs. **replay** works on transcripts from before Stroq was installed, because it reads the agent's own log. Verdicts are what today's policy would do, not a recording of what was allowed at the time. **sent** answers whether a key left the machine. **attack** replays a fixed set (36 on the 0.30.0 release notes: some denied, some asked, none expected to pass through) in a sandbox.

**console** listens only on 127.0.0.1, asks for no account, and does not phone home. It does not start the agent. Adding hooks from the console requires macOS or Linux. On Windows, use **init**.

# CAVEATS

**replay** and **sent** read local session files. They do not prove that a future session will be stopped. **attack** scores the policy you have installed. A newer release can change the counts.

The console binds to loopback. Do not put it on a public port. **sent** is designed to print key names and sources, not the secrets themselves. Treat a transcript you paste elsewhere as sensitive anyway.

# HISTORY

Stroq is published by AGGIB as `@stroq/cli` under the Apache-2.0 license. The project site is stroq.dev. The CLI, the console, and the hook installer are one package.

# SEE ALSO

[node](/man/node)(1), [npm](/man/npm)(1), [npx](/man/npx)(1)

# RESOURCES

```[Source code](https://github.com/AGGIB/Stroq)```

```[Homepage](https://stroq.dev)```

<!-- verified: 2026-11-07 -->
