# TAGLINE

use binary search to find the commit that introduced a bug

# TLDR

**Start** a bisect session

```git bisect start```

**Start** with the bad and good commits given up front

```git bisect start [HEAD] [v1.0]```

**Mark** the current commit as broken

```git bisect bad```

**Mark** a commit as working

```git bisect good [commit]```

**Skip** a commit that cannot be tested

```git bisect skip```

**Automate** the search with a test script

```git bisect run [./test.sh]```

**Automate** with an inline test command

```git bisect run [make test]```

**Show** what has been marked so far

```git bisect log```

**End** the session and return to where you started

```git bisect reset```

# SYNOPSIS

**git bisect** _subcommand_ [_options_]

# PARAMETERS

**start** [_bad_ [_good_...]] [**--**] [_paths_...]
> Begin a session. Optionally give the bad and good commits immediately, and limit the search to _paths_.

**bad** [_commit_]
> Mark a commit as containing the bug. Defaults to the current commit.

**good** [_commit_...]
> Mark one or more commits as free of the bug.

**new** [_commit_], **old** [_commit_]
> Aliases for **bad** and **good**, for hunting any change in behaviour rather than a bug.

**terms** **--term-old**=_term_ **--term-new**=_term_
> Use your own words, e.g. **--term-old=fast --term-new=slow**.

**skip** [_commit_...]
> Skip commits that cannot be tested, e.g. ones that do not build.

**run** _cmd_ [_args_...]
> Run _cmd_ at each step and mark automatically from its exit status.

**reset** [_commit_]
> End the session and return to the original branch, or to _commit_.

**log**
> Print the log of what has been marked.

**replay** _logfile_
> Replay a bisect log, resuming a previous session.

**visualize**, **view**
> Show the remaining candidate commits in gitk or **git log**.

**--first-parent**
> Follow only the first parent of merge commits.

**--no-checkout**
> Do not check out the tree; just update **BISECT_HEAD**. Useful when checkout is expensive.

# DESCRIPTION

**git bisect** finds the commit that introduced a problem by binary search. You tell it one commit where the bug exists and one where it does not; it checks out a commit in the middle, you test and report the result, and it halves the remaining range each time. The search is logarithmic, so roughly **10** tests suffice for **1000** commits and **20** for a million.

The **good**/**bad** vocabulary assumes you are hunting a bug, but the mechanism is general: any property that changed at some point can be bisected. **old**/**new**, and the custom **--term-old**/**--term-new**, exist for hunting a performance regression, a behaviour change, or even the commit that fixed something.

**git bisect run** is where the command earns its reputation. Given a script that exits **0** for good and non-zero for bad, git drives the whole search unattended. The special exit code **125** means "cannot test this commit", producing the same effect as **skip**, and any exit code between **126** and **255** aborts the session. Because **run** takes a command line rather than only a file, **git bisect run make test** works directly.

When the search finishes, git reports the first bad commit and leaves you at it. **git bisect reset** returns you to where you were.

# CAVEATS

Exit code **1** means bad, but so do most failures, including a compile error or a missing dependency. A test script that cannot distinguish "the bug is present" from "this commit does not build" will blame the wrong commit. Return **125** for untestable commits.

Avoid exit code **255** in a test script: it aborts the bisect. **grep** returns **1** when it finds nothing, which is convenient, but a script ending in a bare **grep** inverts the meaning you probably intended, so be explicit about the exit status.

Bisect checks out arbitrary historical commits, so a dirty working tree can block the checkout or silently contaminate the test. Commit or stash first. Build artifacts and generated files also survive between checkouts and can mask the real result: clean them in the test script.

**skip** does not narrow the range as effectively as a real answer, and skipping a whole region can leave git unable to identify a single culprit, reporting a range of candidates instead.

The result is only the first commit where your test fails, which is not always the commit that caused the problem. A bug can be introduced latent and only exposed later by an unrelated change.

If history contains merges, the first bad commit may be a merge, and the actual change lives on the merged branch. **--first-parent** limits the search to the mainline, which is often what you want on a repository that merges feature branches.

# HISTORY

**git bisect** was added by **Linus Torvalds** in **2005**, in git's first year, initially as a shell script. **git bisect run** followed shortly after, contributed by **Christian Couder**, who also added the **old**/**new** terminology in git **2.7** (**2015**) for bisecting changes that are not bugs. The implementation was gradually rewritten in C over subsequent releases.

# SEE ALSO

[git](/man/git)(1), [git-log](/man/git-log)(1), [git-blame](/man/git-blame)(1), [git-annotate](/man/git-annotate)(1), [git-stash](/man/git-stash)(1)

# RESOURCES

```[Source code](https://github.com/git/git)```

```[Homepage](https://git-scm.com/)```

```[Documentation](https://git-scm.com/docs/git-bisect)```

<!-- verified: 2026-07-16 -->
