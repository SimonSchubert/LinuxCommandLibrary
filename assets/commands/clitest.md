# TAGLINE

Doctest-style automatic testing for Unix command lines

# TLDR

**Run tests** from a file

```clitest [examples/intro.txt]```

**Show help**

```clitest --help```

**Run via Docker**

```docker run --rm -t aureliojargas/clitest [tests.txt]```

# SYNOPSIS

**clitest** [*options*] *testfile*...

# DESCRIPTION

**clitest** is a portable POSIX shell script that tests Unix command lines the way Python **doctest** tests interactive sessions. You write a text file that looks like a shell transcript (**$** prompts, commands, expected stdout). **clitest** executes each command and checks that the output matches exactly.

No special DSL: test files use familiar CLI syntax. Useful for documenting and regression-testing shell tools and tutorials.

Install by downloading the script, **chmod +x**, and placing it on **PATH**, or use the Docker image **aureliojargas/clitest**.

# PARAMETERS

*testfile*

> Path to one or more test transcript files.

See **clitest --help** for flags (progress, prefixes, environment, and failure behaviour vary by version).

# EXAMPLE TEST FILE

```
$ echo "Hello World"
Hello World
$ cd /tmp
$ pwd
/tmp
```

# CAVEATS

Output must match exactly (whitespace and locale matter). Commands run for real with your shell environment; avoid destructive examples. Interactive programs and TUI apps are a poor fit. Portable sh, but individual tests may assume Linux utilities.

# SEE ALSO

[bats](/man/bats)(1), [shunit2](/man/shunit2)(1), [expect](/man/expect)(1)

# RESOURCES

```[Source code](https://github.com/aureliojargas/clitest)```

<!-- verified: 2026-07-19 -->
