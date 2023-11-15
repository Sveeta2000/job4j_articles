package ru.job4j.articles.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ru.job4j.articles.model.Article;
import ru.job4j.articles.model.Word;
import ru.job4j.articles.service.generator.ArticleGenerator;
import ru.job4j.articles.store.Store;

public class SimpleArticleService implements ArticleService {

    private final Logger logger = LoggerFactory.getLogger(SimpleArticleService.class.getSimpleName());

    private final ArticleGenerator articleGenerator;

    public SimpleArticleService(ArticleGenerator articleGenerator) {
        this.articleGenerator = articleGenerator;
    }

    @Override
    public void generate(Store<Word> wordStore, int count, Store<Article> articleStore) {
        logger.info("Геренация статей в количестве {}", count);
        var words = wordStore.findAll();
        String articleNumber = "Сгенерирована статья № {}";
        Article article;
        for (int i = 0; i < count; i++) {
            logger.info(articleNumber, i);
            article = articleGenerator.generate(words);
            articleStore.save(article);
        }
    }
}
