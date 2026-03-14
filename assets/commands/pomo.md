# TAGLINE

Simple, customizable Pomodoro timer for the terminal

# TLDR

**Start a default 25-minute work session**

```pomo```

**Start a 30-minute work session**

```pomo 30m```

**Start a work session with custom break duration**

```pomo 45m 15m```

**View productivity statistics**

```pomo stats```

# SYNOPSIS

**pomo** [_duration_] [_break_duration_]

**pomo** _command_

# PARAMETERS

_duration_
> Work session length (default: 25m). Accepts formats like 30m, 1h.

_break_duration_
> Break length after work session (default: 5m).

**stats**
> Show productivity statistics with weekly charts and heatmap.

# DESCRIPTION

**pomo** is a terminal-based Pomodoro timer with customizable work and break intervals, real-time progress visualization, ASCII art displays, and cross-platform desktop notifications. It tracks productivity statistics with weekly charts and a GitHub-style activity heatmap.

# HISTORY

**pomo** was created by **Bahaaio** and is written in **Go**.
