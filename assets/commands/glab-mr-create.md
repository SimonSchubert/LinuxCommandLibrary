# TAGLINE

Create a new GitLab merge request

# TLDR

**Create MR interactively**

```glab mr create```

**Create with title**

```glab mr create -t "[title]"```

**Create as draft**

```glab mr create --draft -t "[title]"```

**Create with reviewers**

```glab mr create -t "[title]" --reviewer [user1],[user2]```

**Create to specific branch**

```glab mr create --target-branch [main]```

**Fill from commits**

```glab mr create --fill```

**Skip prompts and push the branch**

```glab mr create --fill --push --yes```

**Create for a linked issue**

```glab mr create --related-issue [issue-number]```

# SYNOPSIS

**glab** **mr** **create** [_options_]

# PARAMETERS

**-t**, **--title** _title_
> MR title.

**-d**, **--description** _text_
> MR description. Use `-` to open an editor.

**--draft**, **--wip**
> Mark the merge request as a draft.

**-a**, **--assignee** _users_
> Assign the MR to users by username; comma-separate or repeat the flag.

**--reviewer** _users_
> Request review from users by username; comma-separate or repeat the flag.

**-b**, **--target-branch** _branch_
> Target/base branch to merge into.

**-s**, **--source-branch** _branch_
> Branch to create the MR from (default: current branch).

**-f**, **--fill**
> Don't prompt for title/description, use commit info instead. Implies **--push**.

**--fill-commit-body**
> When multiple commits exist, fill the description with every commit body. Requires **--fill**.

**-l**, **--label** _labels_
> Add labels by name; comma-separate or repeat the flag.

**-m**, **--milestone** _milestone_
> Assign a milestone by ID or title.

**-i**, **--related-issue** _issue_
> Create the MR for an issue; uses the issue title if **--title** is omitted.

**--push**
> Push local commits to the source branch after creating the MR.

**--remove-source-branch**
> Remove the source branch when the MR is merged.

**--squash-before-merge**
> Squash commits into one when merging.

**-H**, **--head** _repo_
> Use another head repository, as `OWNER/REPO`, `GROUP/NAMESPACE/REPO`, a project ID, or a full URL.

**--template** _name_
> Use a template from `.gitlab/merge_request_templates/` to pre-fill the description.

**-y**, **--yes**
> Skip the submission confirmation prompt. Use with **--fill** to skip all optional prompts.

**-w**, **--web**
> Continue MR creation in the browser.

# DESCRIPTION

**glab mr create** creates a new GitLab merge request from the current branch. It supports drafts, reviewer assignment, labels, milestones, and auto-filling title and description from commit messages.

When run without flags, it launches an interactive prompt for composing the merge request.

# INSTALL

```apt: sudo apt install glab```

```dnf: sudo dnf install glab```

```pacman: sudo pacman -S glab```

```apk: sudo apk add glab```

```zypper: sudo zypper install glab```

```brew: brew install glab```

```nix: nix profile install nixpkgs#glab```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[glab-mr](/man/glab-mr)(1), [glab](/man/glab)(1)

# RESOURCES

```[Documentation](https://docs.gitlab.com/cli/mr/create/)```

```[Source code](https://gitlab.com/gitlab-org/cli)```

<!-- verified: 2026-07-17 -->
