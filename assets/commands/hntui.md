# TAGLINE

Terminal UI for Hacker News

# TLDR

**Open** Hacker News in the terminal

```hntui```

Replace a standalone binary with the **latest release**

```hntui update```

Print the **installed version**

```hntui --version```

# SYNOPSIS

**hntui** [**update** | **version** | **-v** | **--version**]

# DESCRIPTION

**hntui** is a full-screen terminal browser for Hacker News. It loads the public Firebase API and lists six feeds: **Top**, **New**, **Best**, **Ask**, **Show**, and **Jobs**. Two extra lists, **Saved** and **History**, sit beside those feeds.

The story list and the comment thread both use vim-style motion. Stories open in a threaded comment view. A story URL opens in the system browser. Comment links that point at another Hacker News post open inside the app. The mouse works for tabs, rows, collapsing a thread, and a right-click menu (save, open URL, open comments).

With no argument, **hntui** starts the interface. **hntui update** checks GitHub releases. A binary install is replaced in place. A Bun install prints the **bun add -g @ahmd-sh/hntui** command instead of overwriting itself. A source checkout tells you to **git pull**. **hntui --version** (also **-v** or **version**) prints the version and exits. Any other argument is an error.

# KEY BINDINGS

**j**, **k**, **Down**, **Up**
> Move the cursor.

**gg**, **G**
> Jump to the first or last row.

**Ctrl-D**, **Ctrl-U**, **PgDown**, **PgUp**
> Scroll half a page.

**h**, **l**, **Left**, **Right**
> Previous or next category on the story list.

**Tab**, **Shift-Tab**
> Cycle categories.

**1** through **6**
> Jump to Top, New, Best, Ask, Show, or Jobs.

**c**, **Enter**
> Open the highlighted story and its comments.

**o**
> Open the story URL in a browser.

**y**
> Open the story's Hacker News item page in a browser.

**s**
> Save or unsave the highlighted story.

**S**
> Switch to the saved list.

**H**
> Switch to view history.

**r**
> Refresh the current feed. Ignored on Saved and History.

**x**
> Clear view history. Only works on the History list.

**Space**
> Collapse or expand the comment under the cursor.

**Enter** (comment view)
> Open links from that comment. A Hacker News post opens in the app.

**h**, **Esc**, **Backspace**
> Leave the comment view.

**t**
> Swap the dark theme and the light theme for this session.

**?**
> Show or hide the shortcut overlay. **Esc** closes it.

**q**, **Ctrl-C**
> Quit. **Ctrl-C** quits from the story list.

# CONFIGURATION

State is two JSON files under **~/.config/hntui/**:

**saved.json**
> Stories marked with **s**, each stored as an id and a timestamp. A star marks them in the list. **S** opens the saved tab.

**history.json**
> Stories that were opened, capped at **1000** entries. **H** opens the list. **x** clears it.

On first launch, a directory left at **~/.config/hackernuis/** (the previous name of this program) is renamed to **~/.config/hntui/**. There is no keybinding or theme file. The theme toggle lasts until the process exits. Failed writes to the JSON files are ignored.

# CAVEATS

Needs a network connection to the Hacker News API. The UI expects a UTF-8 terminal with truecolor and mouse reporting. Because the app captures the mouse, drag-to-select uses **Option**-drag on macOS and **Shift**-drag on Linux. Prebuilt binaries cover Linux (x64 and arm64) and Apple Silicon. An Intel Mac has no prebuilt binary. **hntui update** on a Bun or source install does not replace the files itself.

# HISTORY

**hntui** was written by **Ahmed Shaikh** in **2026**. It is a TypeScript program on **OpenTUI**, React, and **Bun**, published as **@ahmd-sh/hntui**. It was renamed from **hackernuis**.

# SEE ALSO

[hackernews-tui](/man/hackernews-tui)(1), [newsboat](/man/newsboat)(1)

# RESOURCES

```[Source code](https://github.com/ahmd-sh/hntui)```

<!-- verified: 2026-09-28 -->
