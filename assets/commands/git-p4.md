# TAGLINE

Bidirectional Git-Perforce integration

# TLDR

**Clone from Perforce** depot with full history

```git p4 clone //depot/path@all```

**Clone into a specific directory**

```git p4 clone //depot/path@all [directory]```

**Sync latest changes** from Perforce

```git p4 sync```

**Submit git commits** back to Perforce

```git p4 submit```

**Rebase current branch** on top of Perforce changes

```git p4 rebase```

**Clone with branch detection**

```git p4 clone --detect-branches //depot/path@all```

# SYNOPSIS

**git p4** _command_ [_options_]

# PARAMETERS

**clone** _DEPOT_
> Import from Perforce depot.

**sync**
> Fetch changes from Perforce.

**submit**
> Submit git commits to Perforce.

**rebase**
> Rebase on Perforce changes.

**--branch** _BRANCH_
> Target branch.

**--detect-branches**
> Auto-detect Perforce branch mappings.

**--bare**
> Perform a bare clone (no working directory).

**--use-client-spec**
> Use the Perforce client spec for file filtering.

**--origin** _ref_
> Upstream location from which commits are identified to submit (default: most recent p4 commit reachable from HEAD).

**--shelve**
> Create shelved changelists instead of submitting.

**--conflict** _(ask|skip|quit)_
> Conflict handling during submit (default: ask).

**--verbose**
> Provide more detailed output.

**--help**
> Display help information.

# DESCRIPTION

**git p4** enables bidirectional interaction between Git and Perforce. It can import Perforce depot history into a Git repository and submit Git commits back to Perforce, supporting both migration and ongoing hybrid workflows.

The tool maps Perforce depot paths to Git branches, allowing teams to work with Git locally while maintaining synchronization with a Perforce server. It supports gradual migration from Perforce to Git as well as permanent dual-system setups.

The **clone** command creates a new Git repo from Perforce. **sync** fetches new changes without modifying working files. **rebase** syncs and rebases the current branch. **submit** sends Git commits to Perforce as individual changelists.

# CAVEATS

Requires Python and p4 client. Some Perforce features don't map to git. Complex branch layouts challenging.

# HISTORY

git p4 was created to support teams transitioning from **Perforce** to Git, or needing to work with both systems simultaneously.

# SEE ALSO

[git](/man/git)(1), [p4](/man/p4)(1), [git-log](/man/git-log)(1)
