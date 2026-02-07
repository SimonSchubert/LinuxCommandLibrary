# TAGLINE

Use binary search to find commits that introduced bugs

# TLDR

**Start bisecting**

```git bisect start```

**Mark current as bad**

```git bisect bad```

**Mark known good commit**

```git bisect good [commit]```

**Reset bisect**

```git bisect reset```

**Run automated test**

```git bisect run [test-script.sh]```

# SYNOPSIS

**git bisect** _subcommand_ [_options_]

# PARAMETERS

**start**
> Begin bisection.

**bad** _COMMIT_
> Mark commit as bad.

**good** _COMMIT_
> Mark commit as good.

**reset**
> End bisection session.

**run** _SCRIPT_
> Automate with test script.

**skip**
> Skip untestable commit.

**log**
> Show bisect log.

**--help**
> Display help information.

# DESCRIPTION

**git bisect** uses binary search to find the commit that introduced a bug. Given a known good and bad commit, it systematically narrows down the range until finding the exact commit.

The process works by checking out commits halfway between good and bad, testing, and marking the result. This logarithmic search reduces the number of commits to test dramatically -- finding a bug among 1000 commits requires only about 10 tests.

The **run** subcommand fully automates bisection with a test script that returns exit code 0 for good and non-zero for bad, making it possible to find regressions without manual intervention.

# CAVEATS

Requires testable commits. Skip untestable commits carefully. Clean working directory recommended.

# HISTORY

git bisect is a core **Git** command implementing binary search for debugging, particularly useful for projects with many commits between releases.

# SEE ALSO

[git](/man/git)(1), [git-log](/man/git-log)(1), [git-blame](/man/git-blame)(1)
