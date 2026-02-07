# TAGLINE

Manage Git repositories hosted on AWS CodeCommit.

# TLDR

**Create a new repository**

```aws codecommit create-repository --repository-name [my-repo] --repository-description "[Description]"```

**List all repositories** in the account

```aws codecommit list-repositories```

**Clone a repository** using the credential helper

```git clone codecommit::[region]://[my-repo]```

**Create a branch** from an existing commit

```aws codecommit create-branch --repository-name [my-repo] --branch-name [feature-branch] --commit-id [abc123]```

**Create a pull request**

```aws codecommit create-pull-request --title "[PR Title]" --targets repositoryName=[my-repo],sourceReference=[feature-branch],destinationReference=main```

**Put a file** directly to a repository

```aws codecommit put-file --repository-name [my-repo] --branch-name main --file-content file://[local-file.txt] --file-path [path/in/repo.txt] --commit-message "[message]"```

# SYNOPSIS

**aws codecommit** _command_ [_options_]

# DESCRIPTION

**aws codecommit** is the AWS CLI interface for AWS CodeCommit, a fully managed source control service hosting secure Git repositories. CodeCommit eliminates the need to operate your own source control system and scales automatically to meet project needs.

CodeCommit supports standard Git functionality including branches, commits, and merges. It adds AWS-specific features like pull request approval rules, repository triggers for event notifications, and integration with AWS IAM for access control.

# COMMANDS

**create-repository**
> Create a new CodeCommit repository

**delete-repository**
> Delete a repository

**list-repositories**
> List all repositories in the account

**create-branch**
> Create a new branch

**create-pull-request**
> Create a pull request between branches

**merge-pull-request-by-fast-forward**
> Merge a pull request using fast-forward

**put-file**
> Add or update a file in a repository

**get-file**
> Retrieve file contents as base64

**create-commit**
> Create a commit with multiple file changes

**create-approval-rule-template**
> Define approval requirements for pull requests

# CAVEATS

CodeCommit uses AWS IAM for authentication rather than SSH keys or passwords by default. The Git credential helper must be configured for HTTPS access. Repository size is limited to 2GB for individual files and there are quotas on API requests per second.

# HISTORY

AWS CodeCommit launched in **July 2015** as part of the AWS developer tools suite. It provided a Git-compatible managed repository as an alternative to GitHub Enterprise or self-hosted GitLab. Pull request support was added in **2017**, and approval templates for compliance workflows in **2019**.

# SEE ALSO

[aws](/man/aws)(1), [git](/man/git)(1), [aws-codebuild](/man/aws-codebuild)(1), [aws-codepipeline](/man/aws-codepipeline)(1)
