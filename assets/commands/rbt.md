# TAGLINE

Command-line client for Review Board code review

# TLDR

**Post a new review request** for uncommitted changes

```rbt post```

**Post a review request** for specific commits

```rbt post [revision]```

**Update an existing review request**

```rbt post -u```

**Update a specific review request** by ID

```rbt post -r [review_request_id]```

**Apply a patch** from a review request

```rbt patch [review_request_id]```

**Show the status** of review requests

```rbt status```

**Land a reviewed change** (merge and close)

```rbt land [review_request_id]```

# SYNOPSIS

**rbt** _command_ [_options_] [_arguments_]

# PARAMETERS

**post**
> Create or update a review request with local changes

**patch**
> Apply the diff from a review request to the local tree

**land**
> Land a reviewed change (commit, push, and close review)

**status**
> Show pending review requests and their status

**diff**
> Print the diff that would be uploaded for review

**close**
> Close a review request (submitted or discarded)

**setup-repo**
> Configure the repository for RBTools

**--server** _URL_
> Specify the Review Board server URL

**-r**, **--review-request-id** _ID_
> Specify the review request ID to update

**-u**, **--update**
> Update the most recent matching review request

**--publish**
> Publish the review request immediately

**-d**, **--debug**
> Enable debug output

**-h**, **--help**
> Display help information

# DESCRIPTION

**rbt** is the command-line client for Review Board, a web-based code review tool. It automates creating, updating, and managing code review requests from the terminal, integrating with version control systems like Git, Mercurial, SVN, Perforce, and CVS.

The most common workflow involves **rbt post** to upload changes for review, then **rbt land** to merge approved changes. The tool automatically generates diffs and detects repository configuration, minimizing manual steps.

Configuration is typically stored in a **.reviewboardrc** file in the repository root, containing the server URL and repository settings. This allows team members to share consistent configuration.

# CONFIGURATION

**.reviewboardrc**
> Per-repository configuration file specifying the Review Board server URL, repository name, and default settings for review requests.

**REVIEWBOARD_URL**
> Environment variable specifying the Review Board server URL as an alternative to .reviewboardrc.

# CAVEATS

Requires Python 3.7+ and a configured Review Board server. The server URL must be specified either via **--server**, environment variable, or .reviewboardrc file.

Repository must be properly configured with **rbt setup-repo** or manual .reviewboardrc configuration before posting reviews.

Credentials are typically stored using the system keyring or can be provided interactively. Avoid storing credentials in plain text configuration files.

# HISTORY

RBTools is part of the Review Board project, created by **Christian Hammond** and **David Trowbridge** at VMware. Review Board was first released in **2007** as an open-source code review tool designed to simplify the peer review process. The rbt command replaced the earlier post-review script around Review Board 2.0.

# SEE ALSO

[git](/man/git)(1), [hg](/man/hg)(1), [svn](/man/svn)(1), [diff](/man/diff)(1)
