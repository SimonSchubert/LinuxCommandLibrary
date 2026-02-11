# TAGLINE

Browser automation and testing library

# TLDR

**Install Puppeteer**

```npm install puppeteer```

**Run Puppeteer script**

```node [script.js]```

**Install without bundled Chrome**

```npm install puppeteer-core```

# SYNOPSIS

**puppeteer** JavaScript library for browser automation

# DESCRIPTION

**Puppeteer** is a Node.js library for controlling Chrome/Chromium. It provides a high-level API for headless browser automation, testing, screenshot capture, and PDF generation.

# BASIC SCRIPT

```javascript
const puppeteer = require('puppeteer');

(async () => {
  const browser = await puppeteer.launch();
  const page = await browser.newPage();
  await page.goto('https://example.com');
  await page.screenshot({path: 'example.png'});
  await browser.close();
})();
```

# EXAMPLES

```javascript
// Generate PDF
await page.pdf({path: 'page.pdf', format: 'A4'});

// Click element
await page.click('#submit');

// Type text
await page.type('#search', 'query');

// Wait for selector
await page.waitForSelector('.result');

// Evaluate in page context
const title = await page.evaluate(() => document.title);

// Headful mode
const browser = await puppeteer.launch({headless: false});
```

# COMMON OPTIONS

```javascript
puppeteer.launch({
  headless: true,
  slowMo: 100,           // Slow down
  args: ['--no-sandbox'],
  executablePath: '/path/to/chrome'
});
```

# CAVEATS

Downloads Chromium by default (~150MB). Use puppeteer-core with own browser. Memory-intensive.

# HISTORY

Puppeteer was developed by the **Google Chrome DevTools** team, released in 2017 as the official Node.js library for Chrome automation.

# SEE ALSO

[playwright](/man/playwright)(1), [selenium](/man/selenium)(1), [cypress](/man/cypress)(1)
