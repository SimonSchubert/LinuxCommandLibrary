# TAGLINE

Prepare and manage a patch series for submission

# TLDR

**Start a new tracked branch** for a series

```b4 prep -n [topical-branch-name]```

**Enroll the current branch** for b4 management

```b4 prep -e [base-branch]```

**Seed a new branch** from a previously posted series

```b4 prep -F [message-id]```

**Edit the cover letter** in your editor

```b4 prep --edit-cover```

**Auto-populate To and Cc** from maintainers and git history

```b4 prep --auto-to-cc```

**Run pre-submission checks** on the series

```b4 prep --check```

# SYNOPSIS

**b4** **prep** [_options_]

# DESCRIPTION

**b4 prep** sets up and maintains a patch series as a dedicated, b4-tracked git branch. After creating or enrolling a branch, you add commits as usual and reorder or amend them with **git rebase -i**; b4 stores the cover letter and series metadata inside the branch so revisions stay versioned alongside the code.

It can build the recipient list automatically from MAINTAINERS files and commit history, validate the series against project conventions, and hand a clean series to **b4 send** for delivery. Each time you post, b4 records the revision so later submissions are numbered correctly.

# PARAMETERS

**-n** _NAME_, **--new** _NAME_
> Create a new b4-tracked branch named _NAME_ for the series.

**-f** _POINT_, **--fork-point** _POINT_
> Use _POINT_ as the fork point when creating the new branch.

**-e** _[BRANCH]_, **--enroll** _[BRANCH]_
> Enroll an existing branch for b4 management, tracking against _BRANCH_.

**-F** _MSGID_, **--from-thread** _MSGID_
> Populate a new branch from a previously posted series.

**--edit-cover**
> Open the cover letter in your editor.

**--show-revision**
> Show the current tracked revision of the series.

**--force-revision** _N_
> Force the series to revision number _N_.

**--auto-to-cc**
> Collect To and Cc recipients from maintainers and git history.

**--check**
> Run b4 and project checks against the series.

**--cleanup** _[BRANCH]_
> Archive and remove a completed prep-tracked branch.

# INSTALL

```dnf: sudo dnf install b4```

```pacman: sudo pacman -S b4```

```apk: sudo apk add b4```

```zypper: sudo zypper install b4```

```brew: brew install b4```

```nix: nix profile install nixpkgs#b4```

<!-- packages: 2026-07-22 -->
# SEE ALSO

[b4](/man/b4)(1), [b4-send](/man/b4-send)(1), [git-rebase](/man/git-rebase)(1)

# RESOURCES

```[Documentation](https://b4.docs.kernel.org/)```

<!-- verified: 2026-06-10 -->
