# TLDR

**Clone from Perforce**

```git p4 clone //depot/path@all```

**Sync changes**

```git p4 sync```

**Submit to Perforce**

```git p4 submit```

**Rebase on Perforce**

```git p4 rebase```

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
> Auto-detect branches.

**--help**
> Display help information.

# DESCRIPTION

**git p4** enables bidirectional interaction between Git and Perforce. It imports Perforce history into git and can submit git commits back to Perforce.

The tool supports gradual migration from Perforce to Git, or ongoing hybrid workflows. It maps Perforce depot paths to git branches.

git p4 bridges Git and Perforce version control systems.

# CAVEATS

Requires Python and p4 client. Some Perforce features don't map to git. Complex branch layouts challenging.

# HISTORY

git p4 was created to support teams transitioning from **Perforce** to Git, or needing to work with both systems simultaneously.

# SEE ALSO

[git](/man/git)(1), [p4](/man/p4)(1)
