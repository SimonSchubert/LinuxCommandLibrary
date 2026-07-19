# TAGLINE

Minimalist command-line habit tracker

# TLDR

**Open daily check-in** (alias often **h**)

```habitctl```

**Edit habit list** in $EDITOR

```habitctl edith```

**First run** creates config under ~/.habitctl

```habitctl```

# SYNOPSIS

**habitctl** [*command*]

# DESCRIPTION

**habitctl** is a minimalist terminal habit tracker. Habits and a log live as plain files under **~/.habitctl/**. On first run it creates **habits** and **log**. Use **edith** to define habits with a period number (1 = daily, 7 = weekly, 0 = log-only) and a name. Running **habitctl** interactively prompts **y/n/s** (yes / no / skip) per habit and draws a compact history graph.

Build from source with Rust: **cargo build --release** (binary **target/release/habitctl**). Many users alias it to **h**.

# PARAMETERS

*(no args)*

> Interactive daily log entry and history view.

**edith**

> Open the habit list in **$EDITOR**.

Other subcommands, if present in your build, are shown by **habitctl --help**.

# CONFIGURATION

**~/.habitctl/habits**

> Habit definitions: lines like **1 Meditated** or **7 Cleaned the apartment**.

**~/.habitctl/log**

> Append-only log of answers.

# CAVEATS

Designed for personal local use; no sync or multi-device support. Graph density depends on terminal width. Skipping (**s**) is for days when the habit did not apply.

# SEE ALSO

[klog](/man/klog)(1), [task](/man/task)(1), [todo.sh](/man/todo.sh)(1)

# RESOURCES

```[Source code](https://github.com/blinry/habitctl)```

<!-- verified: 2026-07-19 -->
