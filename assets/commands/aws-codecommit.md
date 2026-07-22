# TAGLINE

Manage Git repositories hosted on AWS CodeCommit.

# TLDR

**Create a new repository**

```aws codecommit create-repository --repository-name [my-repo] --repository-description "[Description]"```

**List all repositories** in the account

```aws codecommit list-repositories```

**Get details** about a repository

```aws codecommit get-repository --repository-name [my-repo]```

**Clone a repository** using git-remote-codecommit (install with pip install git-remote-codecommit)

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

**get-repository**
> Get metadata about a repository, including its clone URLs

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

AWS CodeCommit is no longer available to new customers as of mid-**2024**; existing customers can continue using it. CodeCommit uses AWS IAM for authentication rather than SSH keys or passwords by default. For HTTPS access, configure either the Git credential helper or git-remote-codecommit. Individual files are limited to 2GB and there are quotas on API requests per second.

# HISTORY

AWS CodeCommit launched in **July 2015** as part of the AWS developer tools suite. It provided a Git-compatible managed repository as an alternative to GitHub Enterprise or self-hosted GitLab. Pull request support was added in **2017**, and approval templates for compliance workflows in **2019**.

# INSTALL

```dnf: sudo dnf install aws```

```pacman: sudo pacman -S aws-cli```

```apk: sudo apk add aws-cli```

```zypper: sudo zypper install aws-cli```

<!-- packages: 2026-07-22 -->
# SEE ALSO

[aws](/man/aws)(1), [git](/man/git)(1), [aws-codebuild](/man/aws-codebuild)(1), [aws-codepipeline](/man/aws-codepipeline)(1)

# RESOURCES

```[Source code](https://github.com/aws/aws-cli)```

```[Homepage](https://aws.amazon.com/cli/)```

```[Documentation](https://docs.aws.amazon.com/cli/latest/reference/codecommit/index.html)```

<!-- verified: 2026-06-18 -->
