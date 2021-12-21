# Log4jDetectorAgent

[![Build Status](https://app.travis-ci.com/theque5t/Log4jDetectorAgent.svg?branch=main)](https://app.travis-ci.com/github/theque5t/Log4jDetectorAgent)

Agent jar that that scans for [Log4j](https://www.google.com/search?q=log4j) in use within the JVM

## Disclaimer

Please read the [license](./LICENSE). This is a work in progress. Best effort was made to test the software, but it is not guaranteed to work perfectly in all contexts. 

```
THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
```

## Build

```sh
gradle clean ShadowJar
```

## Requirements

Log4jDetectorAgent requires the following to run:

- JRE 8+

## Installation

1. Download the agent [jar](https://github.com/theque5t/Log4jDetectorAgent/releases) to system that needs to be scanned.
```sh
wget "https://github.com/theque5t/Log4jDetectorAgent/releases/download/v1.0.0/Log4jDetectorAgent-v1.0.0.jar"
```

## Usage

Use this agent with the [Log4jDetector](https://github.com/theque5t/Log4jDetector) by following the [usage guide](https://github.com/theque5t/Log4jDetector#usage).

## Contributing

Pull requests are welcome. For major changes, please open an issue first to discuss what you would like to change.

Please make sure to test as appropriate.

## License
[MIT License](LICENSE)

## Acknowledgements

Log4jDetectorAgent makes use of the open source projects listed on the [index.md](build/reports/index.md) in the build/reports directory. [Click here](build/reports/index.md) to be automatically redirected to the [index.md](build/reports/index.md).

## Donations

If you'd like to support the development of future projects, or say thanks for this one, you can donate ADA at the following address: `addr1q9xy47gj8nel06azt5mrlr2zwcut9d2m49xp8wmkmuwuml8y0xfqqy3cz50ly3xjc6z7g7cnhta4z9yansz6qzeq7kxstav289`

---

[![Follow on Github](https://img.shields.io/static/v1?label=Follow&message=theque5t&logo=github)](https://github.com/theque5t)
