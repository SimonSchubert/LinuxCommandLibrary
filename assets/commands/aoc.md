# TAGLINE

Advent of Code puzzle helper (download, read, submit)

# TLDR

**Download** today's puzzle input

```aoc download```

**Download** a specific day

```aoc download --day [1]```

**Submit** an answer

```aoc submit [1] [answer]```

**Show** the calendar / stars

```aoc calendar```

**Read** puzzle description

```aoc read```

# SYNOPSIS

**aoc** *command* [*options*]

# DESCRIPTION

**aoc** (from the **aoc-cli** crate) talks to [Advent of Code](https://adventofcode.com) using your session cookie: download descriptions and inputs, submit answers, and view star progress from the terminal. Install via **cargo install aoc-cli**, Homebrew taps, or release binaries.

Authenticate by placing the session cookie in an environment variable or config file as documented upstream (**AOC_SESSION**, etc.).

# PARAMETERS

**download** | **d**

> Save puzzle statement and/or input files.

**submit** | **s**

> Submit part 1/2 answers.

**read** | **r**

> Show puzzle description.

**calendar** | **c**

> Show calendar and collected stars.

**--day** *n* / **--year** *y*

> Select puzzle day/year (defaults to current event day when in December).

# CAVEATS

Requires a valid AoC session cookie; do not commit it. Respect the event's automation rules and rate limits. Puzzle content is copyright Eric Wastl.

# SEE ALSO

[curl](/man/curl)(1)

# RESOURCES

```[Source code](https://github.com/scarvalhojr/aoc-cli)```

<!-- verified: 2026-07-19 -->
