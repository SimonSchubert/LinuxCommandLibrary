# Git

## Getting Started
Tell git who you are first; the name and email are recorded in every commit you make.
```[git](/man/git) config --global user.name "Your Name"```
```[git](/man/git) config --global user.email "you@example.com"```

Start a new repository in the current directory, or clone an existing one.
```[git](/man/git) init```
```[git](/man/git) clone [url]```

## Everyday Workflow
Changes move in two steps: **add** puts them in the staging area, **commit** turns the staged changes into a permanent snapshot. **status** shows where everything stands.
```[git](/man/git) status```
```[git](/man/git) add [file]```
```[git](/man/git) add .```
```[git](/man/git) commit -m "describe the change"```

Exchange commits with the remote repository.
```[git](/man/git) push```
```[git](/man/git) pull```

> **git add -p** stages interactively, hunk by hunk: ideal for committing only part of your changes. **git pull** is **fetch** (download) plus **merge** in one step.

## Branches
Branches are cheap pointers to commits. **switch** changes branches, **-c** creates one; **checkout** is the older command that does both jobs.
```[git](/man/git) branch```
```[git](/man/git) branch -a```
```[git](/man/git) switch [branchName]```
```[git](/man/git) switch -c [newBranch]```
```[git](/man/git) checkout -b [newBranch]```

Merge another branch into the current one.
```[git](/man/git) merge [branchName]```

Delete branches locally and on the remote. **-d** refuses to delete unmerged work; **-D** forces it.
```[git](/man/git) branch -d [branchName]```
```[git](/man/git) branch -D [branchName]```
```[git](/man/git) push origin --delete [branchName]```

## Inspecting History
```[git](/man/git) log```
```[git](/man/git) log --oneline --graph --all```
```[git](/man/git) show [commitHash]```
```[git](/man/git) blame [fileName]```

**diff** alone shows unstaged changes; **--staged** shows what the next commit will contain.
```[git](/man/git) diff```
```[git](/man/git) diff --staged```
```[git](/man/git) diff [branch1]..[branch2]```

## Undoing Things
Discard uncommitted changes to a file, or unstage it without losing the changes.
```[git](/man/git) restore [fileName]```
```[git](/man/git) restore --staged [fileName]```

Fix the most recent commit (message or forgotten files), or undo a commit safely by creating a new commit that reverses it.
```[git](/man/git) commit --amend```
```[git](/man/git) revert HEAD```

**reset** moves the branch pointer back. **--soft** keeps your changes staged, **--hard** throws them away.
```[git](/man/git) reset --soft HEAD~1```
```[git](/man/git) reset --hard HEAD~1```

> **revert** is safe on shared branches because it only adds a commit. **reset --hard** and **--amend** rewrite history: avoid them on commits you have already pushed.

Stop tracking files that are now in .gitignore but were committed earlier.
```[git](/man/git) rm -r --cached .```
```[git](/man/git) add .```
```[git](/man/git) commit -m "remove ignored files"```

## Stashing
Put uncommitted work aside to get a clean working directory, then bring it back later. **-u** includes untracked files.
```[git](/man/git) stash -u```
```[git](/man/git) stash list```
```[git](/man/git) stash pop```
```[git](/man/git) stash apply```

> **pop** applies the stash and removes it from the list; **apply** keeps it around, useful when applying the same work to several branches.

## Tags
Tags mark specific commits, typically releases. Annotated tags (**-a**) store author, date, and a message.
```[git](/man/git) tag [tagName]```
```[git](/man/git) tag -a v1.0 -m "release 1.0"```
```[git](/man/git) tag -d [tagName]```
```[git](/man/git) push --tags```

> Tags are not pushed by default. Push them explicitly with **--tags** or **git push origin [tagName]**.

## Remotes
A remote is a named URL of another copy of the repository; **origin** is the conventional name for the main one.
```[git](/man/git) remote -v```
```[git](/man/git) remote add [remoteName] [remoteURL]```
```[git](/man/git) fetch [remoteName]```
```[git](/man/git) pull [remoteName] [branchName]```
```[git](/man/git) push -u [remoteName] [branchName]```

> **push -u** links the local branch to the remote one, so future **git push** and **git pull** work without arguments.

## Rewriting History
**rebase** replays your commits on top of another branch for a linear history; **cherry-pick** copies a single commit onto the current branch.
```[git](/man/git) rebase [branchName]```
```[git](/man/git) rebase -i HEAD~3```
```[git](/man/git) cherry-pick [commitHash]```

> Interactive rebase (**-i**) lets you reorder, squash, and reword commits. As with **reset**, never rebase commits that others may already have pulled.

## Getting Help
```[git](/man/git) help [command]```
```[git](/man/git) help -g```
