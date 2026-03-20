# TAGLINE

Automated testing framework for bash scripts

# TLDR

**Run** test file

```bats [test.bats]```

**Run** all tests in directory

```bats [tests/]```

**Tap output**

```bats --tap [test.bats]```

**Pretty** formatting

```bats --pretty [test.bats]```

**Filter** by test name

```bats --filter ["pattern"] [test.bats]```

# SYNOPSIS

**bats** [_options_] _test-file_...

# DESCRIPTION

**bats** (Bash Automated Testing System) is a TAP-compliant testing framework for Bash scripts. It provides a simple syntax for writing tests and executing them with readable output.

The tool enables test-driven development and continuous integration for shell scripts.

# PARAMETERS

**-c**, **--count**
> Count tests without running

**-f**, **--filter** _pattern_
> Filter tests by name pattern

**-t**, **--tap**
> Output in TAP format

**-p**, **--pretty**
> Pretty print output

**-r**, **--recursive**
> Run tests recursively

**-j**, **--jobs** _num_
> Number of parallel jobs (requires GNU parallel)

**-F**, **--formatter** _name_
> Output formatter (pretty, tap, tap13, junit)

**-T**, **--timing**
> Add timing information to tests

**-x**, **--trace**
> Print test commands as they are executed (like set -x)

**--filter-tags** _tags_
> Only run tests matching all comma-separated tags

**--filter-status** _status_
> Run tests by status from last run (failed, missed)

**-o**, **--output** _dir_
> Directory to write report files

**--no-tempdir-cleanup**
> Preserve test output temporary directory

**--print-output-on-failure**
> Automatically print $output on failed tests

**-v**, **--version**
> Display version number

# TEST SYNTAX

```bash
#!/usr/bin/env bats

@test "addition works" {
  result="$(echo 2+2 | bc)"
  [ "$result" -eq 4 ]
}

@test "files exist" {
  [ -f "/etc/hosts" ]
}
```

# ASSERTIONS

Uses standard bash test operators:
- **[ -f file ]** - File exists
- **[ "$a" = "$b" ]** - String equality
- **[ $n -eq 4 ]** - Numeric equality

# HELPER FUNCTIONS

**run** _command_
> Run command and capture output/status

**load** _file_
> Load helper library

**skip** [_reason_]
> Skip current test

# CAVEATS

Tests run in subshells (limited side effects). No built-in assertion library (use test-helper). Parallel execution may have ordering issues. Debugging can be tricky.

# HISTORY

**bats** was created by Sam Stephenson in **2011** to provide a simple testing framework for bash scripts, inspired by similar tools in other languages. The project was later forked and maintained as **bats-core** by the community.

# SEE ALSO

[bash](/man/bash)(1), [shellcheck](/man/shellcheck)(1)
