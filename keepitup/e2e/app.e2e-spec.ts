import { KeepitupPage } from './app.po';

describe('keepitup App', () => {
  let page: KeepitupPage;

  beforeEach(() => {
    page = new KeepitupPage();
  });

  it('should display welcome message', done => {
    page.navigateTo();
    page.getParagraphText()
      .then(msg => expect(msg).toEqual('Welcome to app!!'))
      .then(done, done.fail);
  });
});
