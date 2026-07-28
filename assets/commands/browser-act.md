# TAGLINE

Browser automation CLI built for AI agents

# TLDR

**Extract** content from a protected page (stealth)

```browser-act stealth-extract [https://example.com]```

Open a page in a **session**

```browser-act --session [my-task] browser open [id] [https://example.com]```

Read **indexed** page state

```browser-act --session [my-task] state```

**Click** by element index

```browser-act --session [my-task] click [3]```

**Type** into a field by index

```browser-act --session [my-task] input [2] "[text]"```

Load agent **skills** snapshot

```browser-act get-skills core --skill-version [2.0.2]```

# SYNOPSIS

**browser-act** [_--session_ _name_] _command_ [_args_...]

# PARAMETERS

**--session** _name_
> Named session for multi-task isolation and concurrency

**stealth-extract** _url_
> One-shot fetch of protected page content with stealth mode

**browser open** _id_ _url_
> Open a URL in a browser instance

**state**
> Return indexed interactive elements (token-efficient for LLMs)

**click** _index_
> Click the element at the given index from `state`

**input** _index_ _text_
> Type into the element at the given index

**solve-captcha**
> Auto-solve CAPTCHA challenges when available

**remote-assist**
> Generate a live URL for human takeover, then resume the agent

**get-skills**
> Return environment state, browser list, and available commands for agents

# DESCRIPTION

**browser-act** is a browser automation command-line tool designed for AI coding agents. It emphasizes anti-bot resilience (fingerprints, proxies, CAPTCHA helpers), multi-session concurrency without cookie cross-talk, and compact indexed text output so models can click `3` instead of parsing HTML.

Modes include reusing local Chrome login state, stealth privacy sessions (fresh fingerprint), and fixed-identity stealth for multi-account workflows. Sensitive operations can require confirmation gating at the skill layer.

# CAVEATS

Full install is agent-oriented (skill packages from the BrowserAct skills repo). Some stealth/proxy features need a free login or paid plan. Automating third-party sites may violate their terms of service—use responsibly.

# HISTORY

Open-source **BrowserAct Skills** project providing a browser layer for agentic tooling on Windows, macOS, and Linux.

# SEE ALSO

[playwright](/man/playwright)(1), [chromium](/man/chromium)(1)

# RESOURCES

```[Source code](https://github.com/browser-act/skills)```

```[Homepage](https://www.browseract.com)```

```[Documentation](https://github.com/browser-act/skills/blob/main/docs/README.md)```

<!-- verified: 2026-07-28 -->
