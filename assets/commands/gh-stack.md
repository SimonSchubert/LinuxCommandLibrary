# TAGLINE

Manage stacked GitHub pull requests

# TLDR

**Start a stack** on the repository default branch

```gh stack init```

**Start a stack** with named branches

```gh stack init [feature-auth] [feature-api]```

**Add a branch** on top of the current stack

```gh stack add [api-routes]```

**Stage, commit, and add** a layer in one step

```gh stack add -Am "[Add login endpoint]"```

**Show** the stack

```gh stack view```

**Push branches and open** stacked pull requests

```gh stack submit```

**Rebase** the stack onto the latest trunk

```gh stack rebase```

**Sync** after a pull request merges

```gh stack sync```

# SYNOPSIS

**gh** **stack** _command_ [_options_]

# SUBCOMMANDS

**init** [_branches..._]
> Start a new stack. Existing branches are adopted; missing ones are created.

**add** [_branch_]
> Add a branch on top of the current stack and check it out. Run it from the top branch.

**view**
> Show branches, order, pull request links, and the latest commit.

**checkout** [_stack_|_pr_|_url_|_branch_]
> Check out a stack by stack number, pull request number or URL, or branch name.

**modify**
> Open a terminal UI to drop, fold, insert, rename, or reorder branches.

**unstack** [_stack-number_]
> Remove local tracking and unstack the pull requests on GitHub. Also available as **delete**.

**submit**
> Push every branch, then create or update pull requests and the stack on GitHub.

**sync**
> Fetch, rebase, push, and refresh pull request state. Opening pull requests stays with **submit**.

**rebase** [_branch_]
> Pull from the remote and rebase the stack from the trunk upward.

**push**
> Push active branches with a per-branch **--force-with-lease**. Pull requests stay with **submit**.

**link** _args..._
> Create or update a stack on GitHub from branch names or pull requests, without local tracking.

**merge** [_stack-number_|_pr-number_]
> Merge every pull request up through the chosen one. If any cannot merge, none do.

**switch**
> Pick another branch in the current stack.

**up** [_n_]
> Move _n_ branches toward the top, away from the trunk (default **1**).

**down** [_n_]
> Move _n_ branches toward the trunk (default **1**).

**top**
> Check out the branch furthest from the trunk.

**bottom**
> Check out the branch closest to the trunk.

**trunk**
> Check out the trunk branch, such as **main**.

**alias** [_name_]
> Install a wrapper in **~/.local/bin/** (default name **gs**) that forwards to **gh stack**.

**feedback** [_title_]
> Open a GitHub Discussion in the gh-stack repository.

# PARAMETERS

**-b**, **--base** _branch_
> init, link: trunk branch for the bottom of the stack. Defaults to the repository default branch. **link** ignores this when appending to an existing stack.

**-A**, **--all**
> add: stage all changes, including untracked files. Requires **-m**. Mutually exclusive with **-u**.

**-u**, **--update**
> add: stage changes to tracked files only. Requires **-m**. Mutually exclusive with **-A**.

**-m**, **--message** _text_
> add: commit with this message before creating the branch. With no branch name, the name is generated from the date and the message.

**--auto**
> submit: skip the editor and use generated pull request titles. New pull requests are drafts unless **--open** is also set.

**--open**
> submit, link: mark new and existing pull requests as ready for review.

**--remote** _name_
> submit, sync, rebase, push, link: remote to use. Defaults to the detected remote.

**--prune**
> sync: delete local branches whose pull requests have merged.

**--downstack**
> rebase: only rebase from the trunk through the current branch.

**--upstack**
> rebase: only rebase from the current branch through the top.

**--no-trunk**
> rebase: rebase stack branches onto each other, without fetching or rebasing onto the trunk.

**--continue**
> rebase, modify: resume after conflicts are resolved and staged.

**--abort**
> rebase, modify: restore the stack to the state before the operation.

**--committer-date-is-author-date**
> rebase: set the committer date to the author date. Alias: **--preserve-dates**.

**-s**, **--short**
> view: one line per branch.

**--json**
> view: print the stack as JSON.

**--merge-method** _method_
> merge: **merge**, **squash**, or **rebase**. Shorthands: **--merge**, **--squash**, **--rebase**.

**-y**, **--yes**
> merge: merge without prompting, using the last-used method unless one is given.

**--local**
> unstack: drop local tracking and leave the stack on GitHub.

**--remove**
> alias: remove a previously created alias.

# DESCRIPTION

**gh stack** is GitHub's CLI extension for stacked pull requests. A stack is an ordered chain of branches rooted on a trunk (usually **main**). The bottom branch is the one closest to the trunk; the top is the furthest from it. Each pull request uses the branch below it as its base, so a reviewer sees only that layer.

Install the extension with **gh extension install github/gh-stack**. It needs GitHub CLI **2.0** or later, already authenticated with **gh auth login**. **gh stack init** also turns on **git rerere** so conflict resolutions are remembered.

Local membership and order are stored in **.git/gh-stack**, which is not committed. Interrupted rebase state is kept in **.git/gh-stack-rebase-state**. On submit, the extension pushes the branches, opens one pull request per branch, and links them as a stack on GitHub.

**up** moves away from the trunk and **down** moves toward it. Navigation stops at the ends of the stack. From the trunk, **up** checks out the first stack branch.

**submit** in a terminal opens an editor for titles and descriptions. **Ctrl+S** submits the selected branches; **Ctrl+X** drops a branch and every branch above it. Outside a terminal, or with **--auto**, titles are generated and new pull requests are created as drafts unless **--open** is set. If every pull request in the stack is already merged, **submit** starts a new stack for the remaining branches.

**sync** fetches, fast-forwards the trunk when it can, rebases only if the trunk moved, pushes (with **--force-with-lease** after a rebase), and refreshes pull request state. Opening new pull requests stays with **submit**. When the local and remote stacks have diverged, an interactive run asks which side to keep. A non-interactive run exits successfully and leaves the remote untouched.

**link** is for branches managed by another tool, such as Jujutsu. It pushes the named branches, creates any missing pull requests, and updates the stack on GitHub without writing **.git/gh-stack**. A stack number as the first argument appends the rest to that stack.

**merge** merges every open pull request from the bottom through the one you choose, as one operation. A merge queue on the base branch receives the stack instead, and the queue picks the merge method.

# CAVEATS

Stacked pull requests are in **public preview**, so the command set can change. The repository must have stacked pull requests enabled; otherwise commands fail with exit code **9**.

**submit** (without **--auto**), **modify**, **switch**, and **checkout** with no argument open a full-screen interface and need a terminal. **modify** also requires a clean work tree, a linear history, and no rebase or merge queue in progress.

**push** updates each branch with **--force-with-lease**. The push is not atomic: some branches can update while another is rejected.

This page documents **github/gh-stack**, invoked as **gh stack**. Other projects publish different tools under the same extension name.

# CONFIGURATION

**GH_STACK_THEME** selects the color palette for **submit**, **modify**, **view**, and other colored output. Values are **auto** (default; follow the terminal background), **light**, and **dark**.

**GH_STACK_HYPERLINKS** forces OSC 8 links in **gh stack view --short**. Set it to **1** or **0** when terminal detection is wrong. Unsupported terminals print the full URL.

# HISTORY

GitHub published the **gh-stack** extension in **2026** (the **github/gh-stack** repository was created in February 2026). Stacked pull requests in GitHub CLI are a public preview.

# INSTALL

```nix: nix profile install nixpkgs#gh-stack```

<!-- packages: 2026-09-26 -->

# SEE ALSO

[gh](/man/gh)(1), [gh-pr](/man/gh-pr)(1), [git](/man/git)(1), [git-rebase](/man/git-rebase)(1), [git-branchless](/man/git-branchless)(1), [jj](/man/jj)(1)

# RESOURCES

```[Source code](https://github.com/github/gh-stack)```

```[Homepage](https://docs.github.com/en/pull-requests/how-tos/stacked-pull-requests)```

```[Documentation](https://docs.github.com/en/pull-requests/reference/stacked-prs-cli-commands)```

<!-- verified: 2026-09-26 -->
